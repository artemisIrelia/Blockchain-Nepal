/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption.pkg2;



class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		byte[] key = "Key".getBytes();
		RC4Implementation rc4 = new RC4Implementation(key);
		String message = "Hello";
		System.out.println("Message: " + message);
		String cipherText = rc4.encrypt(message);
		System.out.println("Encrypted: " + cipherText);
		String decrypted = rc4.decrypt(cipherText);
		System.out.print("Decrypted: " + decrypted);
	}
}
