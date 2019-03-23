/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unuse;

/**
 *
 * @author Essn
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.Cipher;

public class Decryptions {

    public static String decrypt(File inputFile) {
        if (!inputFile.getAbsolutePath().endsWith("")){
            return "Can't Decrypt! Bad";
        }
        else{
            try {
                // Đọc file chứa private key
                FileInputStream fis = new FileInputStream("D:/MMANM/Assignment 1/JFileChooserDemo/privateKey.rsa");
                FileInputStream encr = new FileInputStream(inputFile);

                byte[] b = new byte[fis.available()];
                byte[] en = new byte[encr.available()];
                fis.read(b);
                encr.read(en);
                fis.close();
                encr.close();

                // Tạo private key
                PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
                KeyFactory factory = KeyFactory.getInstance("RSA");
                PrivateKey priKey = factory.generatePrivate(spec);

                // Giải mã dữ liệu
                Cipher c = Cipher.getInstance("RSA");
                c.init(Cipher.DECRYPT_MODE, priKey);
                byte decryptOut[] = c.doFinal(en);
                File decrypt = createKeyFile(new File("D:/MMANM/Assignment 1/JFileChooserDemo/decrypt_text.txt"));

                FileOutputStream decr = new FileOutputStream(decrypt);
                decr.write(decryptOut);

    //            byte decryptOut[] = c.doFinal(Base64.getDecoder().decode(
    //                    "aLnLDfGVU5z+MjZaIBV1dOLFiTKkUGuTPf8qmJqUCPICHiv+IidhtZ0F0IywSX3fMxU4eLZCUnrGUYzAcpqkvz6xm8Qxp80ooKOWnvasd65TmOccrWOezH09Q9WJockK2dF70CBf34XhmI8+4+3BimR+XubsMxrcAeZe/RA8jb7E5stp0a5hhO34UGb4ueopqhS7i0dUhCaJKAc2P6LQ+wUGOUZv4CEd6pBsQJ58RPIzkKwTenQzaxSBGndiACJswXzPTTs+E3p5q5OGrY4vH39WYcpmMmB2OueZEJFEjYpSsZ9NSROKAdPlY0UWjOITrFD0ulYPBgvDIjQcog7okA=="));
    //            System.out.println("Dữ liệu sau khi giải mã: " + new String(decryptOut));
                return decrypt.getAbsolutePath();

            } catch (Exception ex) {
                ex.printStackTrace();
                return "Can't Decrypt!";
            }
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
