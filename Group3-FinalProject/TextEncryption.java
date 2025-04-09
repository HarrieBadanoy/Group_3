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

        while (true) {
            System.out.println("\n---------------------");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    int shift = getValidShift(scanner);
                    System.out.print("Enter text to encrypt: ");
                    String textToEncrypt = scanner.nextLine();
                    System.out.println("Encrypted: " + encrypt(textToEncrypt, shift));
                    break;

                case "2":
                    shift = getValidShift(scanner);
                    System.out.print("Enter text to decrypt: ");
                    String textToDecrypt = scanner.nextLine();
                    System.out.println("Decrypted: " + decrypt(textToDecrypt, shift));
                    break;

                case "3":

                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option (1, 2, or 3).");
                    break;
            }
        }
    }

    private static int getValidShift(Scanner scanner) {
        int shift = -1;
        while (true) {
            System.out.print("\nEnter the shift value (1-25): ");
            try {
                String input = scanner.nextLine();
                shift = Integer.parseInt(input);
                if (shift < 1 || shift > 25) {
                    System.out.println("Shift value must be between 1 and 25. Please enter a valid shift value.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer for the shift value.");
            }
        }
        return shift;
    }
}
