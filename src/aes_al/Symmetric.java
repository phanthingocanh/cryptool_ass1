/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes_al;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author NGPD
 */
public class Symmetric {

    private byte[] _initVector;
    private byte[] _key;
    private String _algorithm = "AES128"; // AES128, AES192, AES256, DES
    private String _mode = "CBC"; // CBC, ECB

    /**
     * default constructor, the initVector will randomly be chosen by
     * SecureRandom
     */
    public Symmetric() {
        SecureRandom random = new SecureRandom();
        this._initVector = new byte[16];
        this._key = new byte[16];
        random.nextBytes(_initVector);
        random.nextBytes(_key);
    }

    public void initialize(String algorithm, String mode, byte[] initVector, byte[] key) {
        this.setAlgorithm(algorithm);
        this.setMode(mode);
        this.setInitVector(initVector);
        this.setKey(key);
    }

    public void setAlgorithm(String a) {
        SecureRandom random = new SecureRandom();
        if ("DES".equals(a) || "DESede".equals(a)) {
            this._algorithm = a;
            this._initVector = new byte[8];
            random.nextBytes(this._initVector);
        } else {
            if ("AES192".equals(a) || "AES256".equals(a)) {
                this._algorithm = a;
            } else {
                this._algorithm = "AES128";
            }
            this._initVector = new byte[16];
            random.nextBytes(this._initVector);
        }
    }

    public void setMode(String mode) {
        if ("ECB".equals(mode)) {
            this._mode = "ECB";
        } else {
            this._mode = "CBC";
        }
    }

    public void setInitVector(byte[] initVector) {
        if (initVector == null || initVector.length == 0) {
            return;
        }
        if ("AES".equals(this._algorithm.substring(0, 3))) {
            if (initVector.length == 16) {
                this._initVector = initVector;
            } else {
                this._initVector = ByteUtil.digest(initVector, "SHA-256", 16);
            }
        } else {
            if (initVector.length == 8) {
                this._initVector = initVector;
            } else {
                this._initVector = ByteUtil.digest(initVector, "SHA-256", 8);
            }
        }
    }

    public void setKey(byte[] key) {
        if (key == null) {
            return;
        }
        if ("AES".equals(this._algorithm.substring(0, 3))) {
            int algorithm = Integer.parseInt(_algorithm.substring(3)) / 8;
            if (key.length == algorithm) { // 
                this._key = key;
            } else {
                this._key = ByteUtil.digest(key, "SHA-256", algorithm);
            }
        } else if ("DES".equals(this._algorithm)) {
            if (key.length == 8) {
                this._key = key;
            } else {
                this._key = ByteUtil.digest(key, "SHA-256", 8);
            }
        } else { // DES-EDE
            if (key.length == 24) {
                this._key = key;
            } else {
                this._key = ByteUtil.digest(key, "SHA-256", 24);
            }
        }
    }

    public byte[] getInitVector() {
        return this._initVector;
    }

    public byte[] getKey() {
        return this._key;
    }

    private Cipher getCipher(int cipherMode, byte[] key) {
        String algorithm = this._algorithm.substring(0, 3);
        if ("DESede".equals(this._algorithm)) {
            algorithm = "DESede";
        }
        try {
            if ("CBC".equals(_mode)) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
                IvParameterSpec iv = new IvParameterSpec(_initVector);
                Cipher cipher = Cipher.getInstance(algorithm + "/CBC/PKCS5Padding");
                cipher.init(cipherMode, secretKeySpec, iv);
                return cipher;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
                Cipher cipher = Cipher.getInstance(algorithm + "/ECB/PKCS5Padding");
                cipher.init(cipherMode, secretKeySpec);
                return cipher;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public byte[] encrypt(byte[] plainText) {
        try {
            return getCipher(Cipher.ENCRYPT_MODE, _key).doFinal(plainText);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public byte[] decrypt(byte[] cipherText) {
        try {
            return getCipher(Cipher.DECRYPT_MODE, _key).doFinal(cipherText);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public String encrypt(String fileName) {
        final int BLOCK_SIZE = 1024;
        Cipher cipher = getCipher(Cipher.ENCRYPT_MODE, _key);
        String fileNameOut = fileName + ".encrypted";
        try (
                FileInputStream fileIn = new FileInputStream(fileName);
                FileOutputStream fileOut = new FileOutputStream(fileNameOut);
                CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher);) {
            int read;
            byte[] b = new byte[BLOCK_SIZE];
            File f = new File(fileName);

            long fileSize = f.length();
            if (fileSize % BLOCK_SIZE == 0) {
                while (fileSize > 0) {
                    fileIn.read(b);
                    if (fileSize == BLOCK_SIZE) {
                        b = cipher.doFinal(b, 0, BLOCK_SIZE);
                        fileOut.write(b);
                    } else {
                        cipherOut.write(b);
                    }
                    fileSize -= BLOCK_SIZE;
                }
            } else {
                while ((read = fileIn.read(b)) != -1) {
                    if (read < BLOCK_SIZE) {
                        b = cipher.doFinal(b, 0, read);
                        fileOut.write(b);
                    } else {
                        cipherOut.write(b, 0, read);
                    }
                }
            }

            fileIn.close();
            fileOut.close();
            cipherOut.close();
            return fileNameOut;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String decrypt(String fileName) {
        final int BLOCK_SIZE = 1024;
        Cipher cipher = getCipher(Cipher.DECRYPT_MODE, _key);
        File inFile = new File(fileName);
        String fileNameOut = inFile.getParent() + "\\[decrypted] " + inFile.getName().replaceFirst("[.][^.]+$", "");
        try (
                FileInputStream fileIn = new FileInputStream(fileName);
                FileOutputStream fileOut = new FileOutputStream(fileNameOut);
                CipherInputStream cipherIn = new CipherInputStream(fileIn, cipher);) {
            int read;
            byte[] b = new byte[BLOCK_SIZE];
            while ((read = cipherIn.read(b)) != -1) {
                fileOut.write(b, 0, read);
                fileOut.flush();
            }
            fileIn.close();
            fileOut.close();
            cipherIn.close();
            return fileNameOut;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
