package az.hafizrzazade.fileencryptiondecryption.tools;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;

public class FileEncryption {
	public static String encrypt(String text, SecretKey key) throws Exception {
		Cipher c = Cipher.getInstance("AES");
		c.init(c.ENCRYPT_MODE, key);
		byte[] encryptedBytes = c.doFinal(text.getBytes());
		return Base64.getEncoder().encodeToString(encryptedBytes);
	}
}
