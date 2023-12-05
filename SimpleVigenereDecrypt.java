public class SimpleVigenereDecrypt {

    public static String decrypt(String ciphertext, String key) {
        StringBuilder decrypted = new StringBuilder();
        
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            char k = key.charAt(i % key.length());
            
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char decryptedChar = (char) (((c - k + 26) % 26) + base);
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(c);
            }
        }
        
        return decrypted.toString();
    }

    public static void main(String[] args) {
        String ciphertext = "Lxfopvefrnhr";
        String key = "ABHISHEK";
        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}

