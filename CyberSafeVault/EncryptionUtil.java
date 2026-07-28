/*
* Author: Saanvi Nayak
* Purpose: Simple Encryption/Decryption helper class. Shifts characters forward and backwards to encrypt and decrypt passwords.
*/

public class EncryptionUtil {

public static String encrypt(String text) {

StringBuilder encrypted =
new StringBuilder();

// going through each character and shifting it
for(int i = 0; i < text.length(); i++) {

char ch = text.charAt(i);

ch += 3; //shifting forward by 3
encrypted.append(ch);
}

return encrypted.toString();
}

public static String decrypt(String text) {

StringBuilder decrypted =
new StringBuilder();

// reversing the shift to get original text
for(int i = 0; i < text.length(); i++) {

char ch = text.charAt(i);

ch -= 3; //shifting backwards by 3
decrypted.append(ch);
}

return decrypted.toString();
}

}