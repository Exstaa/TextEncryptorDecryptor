package az.hafizrzazade.fileencryptiondecryption.main;

import java.util.Scanner;

import javax.crypto.SecretKey;

import az.hafizrzazade.fileencryptiondecryption.tools.FileDecryption;
import az.hafizrzazade.fileencryptiondecryption.tools.FileEncryption;
import az.hafizrzazade.fileencryptiondecryption.util.KeyGeneratorUtil;

public class Main {
	public static void main(String[] args) throws Exception {
		SecretKey key;
		Scanner sc = new Scanner(System.in);

		String plainText;
		String decryptedText;
		String encryptedText;

		System.out.println("Encrypt: 1 Decrypt: 2");
		String choice = sc.nextLine();

		if (choice.equals("1")) {
			key = KeyGeneratorUtil.generateKey();
			System.out.println("Write a text to encrypt:");
			plainText = sc.nextLine();
			encryptedText = FileEncryption.encrypt(plainText, key);
			System.out.println("Encrypted Text: " + encryptedText);
		} else {
			key = KeyGeneratorUtil.generateKey();
			System.out.println("Write a text to decrypt:");
			encryptedText = sc.nextLine();
			decryptedText = FileDecryption.decrypt(encryptedText, key);
			System.out.println("Decrypted Text: " + decryptedText);
		}
	}
}
