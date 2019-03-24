/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes_al;

import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.management.InvalidAttributeValueException;

/**
 *
 * @author NGPD
 */
public class ByteUtil {

    /**
     * Convert bytes to hex string for displaying
     *
     * @param bytes input
     * @return hex string
     */
    public static String toHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder("");
        for (byte b : bytes) {
            sb.append(String.format("%02x", b)).append("");
        }
        return sb.toString();
    }

    /**
     * Convert bytes to base64 string representation for displaying
     *
     * @param bytes input
     * @return bytes64 string
     */
    public static String toBase64String(byte[] bytes) {
        return new String(Base64.getEncoder().encode(bytes));
    }

    /**
     * Hash the input with the given Algorithm and return the first
     * <code>len</code> bytes
     *
     * @param in the input in byte[]
     * @param algorithm the string representation of the algorithm Supported
     * algorithms: MD2, MD5, SHA-1, SHA-224, SHA-256, SHA-384, SHA-512
     * @param len length of the output
     * @return 16 bytes hashed output
     */
    public static byte[] digest(byte[] in, String algorithm, int len) {
        try {
            if ("MD5".equals(algorithm)
                    || "MD2".equals(algorithm)
                    || "SHA-1".equals(algorithm)
                    || "SHA-224".equals(algorithm)
                    || "SHA-256".equals(algorithm)
                    || "SHA-384".equals(algorithm)
                    || "SHA-512".equals(algorithm)) {
                MessageDigest md = MessageDigest.getInstance(algorithm);
                byte[] out = md.digest(in);
                return Arrays.copyOf(out, len);
            } else {
                throw new InvalidAttributeValueException("Invalid algorithm syntax. "
                        + "Supported: MD2, MD5, SHA-1, SHA-224, "
                        + "SHA-256, SHA-384, SHA-512");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] digestFile(String fileName, String algorithm) {
        try {
            if ("MD5".equals(algorithm)
                    || "MD2".equals(algorithm)
                    || "SHA-1".equals(algorithm)
                    || "SHA-224".equals(algorithm)
                    || "SHA-256".equals(algorithm)
                    || "SHA-384".equals(algorithm)
                    || "SHA-512".equals(algorithm)) {
                MessageDigest md = MessageDigest.getInstance(algorithm);
                File f = new File(fileName);
                FileInputStream fis = new FileInputStream(f);
                DigestInputStream dis = new DigestInputStream(fis, md);
                int read;
                byte[] b = new byte[1024];
                while ((read = dis.read(b)) != -1) {
                    md.update(b, 0, read);
                }
                return md.digest();
            } else {
                throw new InvalidAttributeValueException("Invalid algorithm syntax. "
                        + "Supported: MD2, MD5, SHA-1, SHA-224, "
                        + "SHA-256, SHA-384, SHA-512");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
