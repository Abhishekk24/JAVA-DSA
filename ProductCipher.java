import java.util.Scanner;

class ProductCipher {
    public static void main(String args[]) {
        // Input
        System.out.println("Enter the text to be encrypted:");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();

        // Substitution encryption
        String substitutionOutput = substituteText(inputText);

        // Transposition encryption
        String transpositionOutput = transposeText(substitutionOutput, n);

        // Output
        System.out.println("\nEncrypted text:");
        System.out.println(transpositionOutput);
    }

    // Substitution encryption function
    public static String substituteText(String text) {
        StringBuilder output = new StringBuilder();
        for (char c : text.toCharArray()) {
            output.append((char) (c + 5));
        }
        return output.toString();
    }

    // Transposition encryption function
    public static String transposeText(String text, int n) {
        int padding = n - (text.length() % n);
        if (padding != n) {
            for (int i = 0; i < padding; i++) {
                text += "/";
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < text.length() / n; j++) {
                char c = text.charAt(i + (j * n));
                output.append(c);
            }
        }

        return output.toString();
    }
}
