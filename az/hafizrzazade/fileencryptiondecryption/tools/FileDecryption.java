package az.hafizrzazade.fileencryptiondecryption.tools;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;

public class FileDecryption {
	public static String decrypt(String text, SecretKey key) throws Exception {
		Cipher c = Cipher.getInstance("AES");
		c.init(c.DECRYPT_MODE, key);
		byte[] decryptedBytes = c.doFinal(Base64.getDecoder().decode(text));
		return new String(decryptedBytes);
	}
}
