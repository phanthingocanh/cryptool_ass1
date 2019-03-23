package aes_al;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class test {

    public static String fileProcessor(int cipherMode,String key,File inputFile,File outputFile, String keysize){
	 try {
               
               byte[] keybyte = key.getBytes("UTF-8");
               MessageDigest sha = MessageDigest.getInstance("SHA-1");
               keybyte = sha.digest(keybyte);
               if ("128 bits".equals(keysize)) {
                   keybyte = Arrays.copyOf(keybyte, 16); // use only first 128 bit
               }
               else if ("192 bits".equals(keysize))
               {
                   keybyte = Arrays.copyOf(keybyte, 24);
               }
               else {
                   keybyte = Arrays.copyOf(keybyte, 32);
               }
//               SecureRandom random = new SecureRandom();
//               byte[] salt = new byte[16];
//               random.nextBytes(salt);
//               KeySpec spec = new PBEKeySpec(key.toCharArray(), salt, 65536, 256); // AES-256
//               SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
//               byte[] keybyte = f.generateSecret(spec).getEncoded();
               SecretKeySpec secretKey = new SecretKeySpec(keybyte, "AES");
//	       Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
	       Cipher cipher = Cipher.getInstance("AES");
	       cipher.init(cipherMode, secretKey);

	       FileInputStream inputStream = new FileInputStream(inputFile);
	       byte[] inputBytes = new byte[(int) inputFile.length()];
	       inputStream.read(inputBytes);

	       byte[] outputBytes = cipher.doFinal(inputBytes);
               
	       FileOutputStream outputStream = new FileOutputStream(outputFile);
	       outputStream.write(outputBytes);
               
	       inputStream.close();
	       outputStream.close();
               String s = outputFile.getAbsolutePath();
               return s;

	    } catch (NoSuchPaddingException | NoSuchAlgorithmException 
                     | InvalidKeyException | BadPaddingException
	             | IllegalBlockSizeException | IOException e) {
		e.printStackTrace();
                
                return "Fail";
            }
     }
	
//     public static void main(String[] args) {
//	String key = "This is a secret";
//	File inputFile = new File("Lab01.pdf");
//	File encryptedFile = new File("text.encrypted");
//	File decryptedFile = new File("decrypted-pdf.pdf");
//		
//	try {
//	     test.fileProcessor(Cipher.ENCRYPT_MODE,key,inputFile,encryptedFile);
//	     test.fileProcessor(Cipher.DECRYPT_MODE,key,encryptedFile,decryptedFile);
//	     System.out.println("Sucess");
//	 } catch (Exception ex) {
//	     System.out.println(ex.getMessage());
//             ex.printStackTrace();
//	 }
//     }
	
}