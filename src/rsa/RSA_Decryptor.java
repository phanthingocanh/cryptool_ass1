package rsa;

import data.ArrayUtil;
import data.FileC;

import java.io.File;
import java.math.BigInteger;

/**
 * Created by DuThien on 28/03/2017.
 */
public class RSA_Decryptor {
    public final BigInteger n;
    public final BigInteger d;
    public final int blockSize;

    public RSA_Decryptor(int blockSize, BigInteger n, BigInteger d) {
        this.n = n;
        this.d = d;
        this.blockSize = blockSize;
    }

    public static byte[] fromBigInt(BigInteger x, int blockSize) {
        byte[] res = new byte[blockSize];
        byte[] e = x.toByteArray();
        if (e.length > blockSize)
            System.arraycopy(e, e.length - blockSize, res, 0, blockSize);
        else
            System.arraycopy(e, 0, res, blockSize - e.length, e.length);
        return res;
    }

    public BigInteger decrypt(byte[] block) {
        return new BigInteger(block).modPow(d, n); //c^d mod n
    }

    public CryptResult decryptFile(String path, String outPath) {
        long timex = System.currentTimeMillis();

        byte[] md = new byte[16];
        FileC in = FileC.openToRead(path);
        FileC out = FileC.openToWrite(outPath);
        in.read(md);
        int remain = in.readInt();
        int size = remain;
        int l;
        byte[] buff;
        while (remain > 0) {
            // System.out.print(".");
            l = in.readInt();
            buff = new byte[l];
            int read = in.read(buff);
           // System.out.println(read-l);
            out.write(fromBigInt(decrypt(buff), blockSize), 0,Math.min(remain, blockSize));
            //System.out.println(remain);
            remain -= blockSize;
        }
        in.close();
        out.close();
       // System.out.println(ArrayUtil.bytes2Hex(md) + "\n" + ArrayUtil.bytes2Hex(Hash.MD5File(outPath)));
        if (ArrayUtil.equalArray(md, Hash.MD5File(outPath))) {
            return new CryptResult(System.currentTimeMillis() - timex, size, true);
        } else {
            new File(outPath).delete();
//            System.out.print(md);

            return new CryptResult(System.currentTimeMillis() - timex, size, false);
        }
    }
}
