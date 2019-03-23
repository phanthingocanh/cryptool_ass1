package rsa;

import dna.vn.box.DialogBox;
import data.ArrayUtil;
import data.FileC;

import java.math.BigInteger;
import java.security.SecureRandom;


/**
 * Created by DuThien on 26/03/2017.
 */
public class RSA_KeyGen {

    public interface RSA_KeyComplete{
        void  onComplete(RSA_KeyGen res);
    }
    public final int bitLength;
    public final BigInteger n, e, d;
    public static RSA_KeyGen  generateKeys(int bitLength) { //64*8
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bitLength / 2+1, 100, r).nextProbablePrime();
        BigInteger q = new BigInteger(bitLength / 2, 100, r).nextProbablePrime();
        BigInteger n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger(bitLength / 2+1, 100, r).nextProbablePrime().add(new BigInteger("2"));
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
        BigInteger d = e.modInverse(m);
        //System.out.println(d.multiply(e).gcd(m));
        return new RSA_KeyGen(bitLength, n, d, e);
    }

    public RSA_KeyGen(int bitLength, BigInteger n, BigInteger e, BigInteger d) {
        this.bitLength = bitLength;
        this.n = n;
        this.d = d;
        this.e = e;
    }

    public static void fromFile(String path, RSA_KeyComplete onResultCallback, DialogBox.OnCancelCallback onCancelCallback)
    {
        FileC f = FileC.openToRead(path);
        if (f == null) return;
        int bitLength = f.readInt();
        int ln = f.readInt();
        byte [] nb = new byte[ln];
        f.read(nb);

        int le = f.readInt();
        byte [] eb = new byte[le];
        f.read(eb);

        int ld  = f.readInt();
        byte [] db = new byte[ld];
        f.read(db);
        byte []md = new byte[16];

        f.read(md);
//        for (int i = 0; i< md.length; ++i)
//            System.out.print(md[i]+" ");
//        System.out.print("\n ");
        f.close();
        DialogBox.passwordDialog("Decrypt your key file", result -> {
            XOR kx = new XOR(result);
            kx.xor(nb);
            kx.xor(eb);
            kx.xor(db);
            BigInteger n = new BigInteger(nb);
            BigInteger e = new BigInteger(eb);
            BigInteger d = new BigInteger(db);
            byte[] mds = Hash.MD5(n.add(e).add(d).setBit(1000).toByteArray());
//            for (int i = 0; i< mds.length; ++i)
//                System.out.print(mds[i]+" ");
//            System.out.print("\n ");
            if (ArrayUtil.equalArray(md, mds))
                onResultCallback.onComplete(new RSA_KeyGen(bitLength, n, e, d));
            else
                DialogBox.showAlert("Error", "Wrong password!");
        }, onCancelCallback);
    }

    public void saveToFile(String path, String password)
    {
        XOR xor = new XOR(password);
        BigInteger sum = n.add(e).add(d).setBit(1000);

        byte[] md = Hash.MD5(sum.toByteArray());
//        for (int i = 0; i< md.length; ++i)
//        System.out.print(md[i]+" ");
//        System.out.print("\n ");

        FileC  f = FileC.openToWrite(path);
        f.writeInt(bitLength);

        byte [] nb = n.toByteArray();
        xor.xor(nb);
        f.writeInt(nb.length);
        f.write(nb);

        byte [] eb = e.toByteArray();
        xor.xor(eb);
        f.writeInt(eb.length);
        f.write(eb);
        byte [] db = d.toByteArray();
        xor.xor(db);
        f.writeInt(db.length);
        f.write(db);
        f.write(md);

        f.close();
    }
}

