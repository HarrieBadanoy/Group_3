package MidtermExam;
import java.util.Scanner;

public class MidtermExam {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = "";
            while (true) {
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                if (ValidName(name)) {
                    String format_case = toFormattedCase(name);

                    System.out.println("Converted Result: ");
                    System.out.println("lower case: " + name.toLowerCase());
                    System.out.println("upper case: " + name.toUpperCase());
                    System.out.println("formatted case: " + format_case);
                    break;
                } else {
                    System.out.println("Error: Invalid name.");
                }
            }
        }

        public static boolean ValidName(String input) {
            return input.matches("[a-zA-Z ]+");
        }
        public static String toFormattedCase(String input) {
            String[] names = input.split(" ");
            StringBuilder formatted = new StringBuilder();

            for (String name : names) {
                if (!name.isEmpty()) {
                    formatted.append(name.substring(0, 1).toUpperCase())
                            .append(name.substring(1).toLowerCase())
                            .append(" ");
                }
            }
            return formatted.toString().trim();
        }
    }

