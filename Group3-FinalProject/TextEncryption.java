import java.util.Scanner;

public class TextEncryption {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shift = 5;

        while (true) {
            System.out.println("---------------------");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("\nEnter text to encrypt: ");
                    String textToEncrypt = scanner.nextLine();
                    System.out.println("Encrypted: " + encrypt(textToEncrypt, shift));
                    break;

                case "2":
                    System.out.print("\nEnter text to decrypt: ");
                    String textToDecrypt = scanner.nextLine();
                    System.out.println("Decrypted: " + decrypt(textToDecrypt, shift));
                    break;

                case "3":
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid input! Try again.");
                    break;
            }
        }
    }
}

