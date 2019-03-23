package rsa;

import data.FileC;

import java.math.BigInteger;

/**
 * Created by DuThien on 28/03/2017.
 */
public class RSA_Encryptor {
    public final BigInteger n;
    public final BigInteger e;
    public final int blockSize;
    public RSA_Encryptor(int blockSize,BigInteger n, BigInteger e) { //Dùng public key.
        this.n = n;
        this.e = e;
        this.blockSize = blockSize;
    }

    public byte[] encrypt(byte[] block) {

        BigInteger res=new BigInteger(block).modPow(e, n);
       // System.out.println(new BigInteger(block));
        return  res.toByteArray();
    }

    public CryptResult encryptFile(String path, String outPath) {
        long timex = System.currentTimeMillis();
        byte[] md = Hash.MD5File(path);
        byte [] block = new byte[blockSize+1];
        block[0] = 0;
        FileC in = FileC.openToRead(path);
        FileC out = FileC.openToWrite(outPath);
        out.write(md);
        out.writeInt(in.remain());
        int size = in.remain();
        while (in.remain()>0)
        {
            int read = in.read(block, 1, blockSize);
            //System.out.println(in.read(block));
            byte [] ec = encrypt(block); //m^e mod n
//            System.out.println(ec.length);

            out.writeInt(ec.length);//Kích thước block thứ i được mã hóa.
            out.write(ec);
        }
        in.close();
        out.close();
        return  new CryptResult( System.currentTimeMillis()- timex, size, true);

    }
}
