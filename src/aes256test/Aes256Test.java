package aes256test;

public class Aes256Test {

	public static void main(String[] args) throws Exception {
		String plainText = "Hello, World!";
		String key = "secret key";
		
		System.out.println("MD5 : " + plainText + " - " + Aes256Util.md5(plainText));
		System.out.println("SHA-256 : " + plainText + " - " + Aes256Util.sha256(plainText));
	
		String encrypted = Aes256Util.encryptAES256("Hello, World!", key);
		System.out.println("AES-256 : enc - " + encrypted);
		System.out.println("AES-256 : dec - " + Aes256Util.decryptAES256(encrypted, key));
	}

}
