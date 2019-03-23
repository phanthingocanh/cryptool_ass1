/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;


/**
 *
 * @author Essn
 */
public class Encryptions {
    public static String encrypt(File inputFile) {

            try {
                    // Đọc file chứa public key
                    FileInputStream fis = new FileInputStream("D:/MMANM/Assignment 1/JFileChooserDemo/publicKey.rsa");
                    byte[] b = new byte[fis.available()];
                    fis.read(b);
                    fis.close();

                    // Tạo public key
                    X509EncodedKeySpec spec = new X509EncodedKeySpec(b);
                    KeyFactory factory = KeyFactory.getInstance("RSA");
                    PublicKey pubKey = factory.generatePublic(spec);

                    // Mã hoá dữ liệu
                    Cipher c = Cipher.getInstance("RSA");
                    c.init(Cipher.ENCRYPT_MODE, pubKey);
                    FileInputStream inputStream = new FileInputStream(inputFile);

                    byte[] inputBytes = new byte[(int) inputFile.length()];
                    inputStream.read(inputBytes);
//                    String msg = "confgodfos";
                    byte encryptOut[] = c.doFinal(inputBytes);
                    String strEncrypt = Base64.getEncoder().encodeToString(encryptOut);
                    File encrypt = createKeyFile(new File("D:/MMANM/Assignment 1/JFileChooserDemo/encrypt_text"));
                    FileOutputStream fos = new FileOutputStream(encrypt);
                    fos.write(encryptOut);

//                    System.out.println("Chuỗi sau khi mã hoá: " + strEncrypt);
                    return encrypt.getAbsolutePath();
//                    return strEncrypt;

            } catch (Exception ex) {
                    ex.printStackTrace();
                    return "Can't encrypt!!";
            }
	}
    private static File createKeyFile(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		} else {
			file.delete();
			file.createNewFile();
		}
		return file;
	}
    
}


