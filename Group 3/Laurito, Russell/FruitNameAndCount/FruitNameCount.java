package FruitNameAndCount;
import java.util.Scanner;

public class FruitNameCount {
    public static void main(String []args){
        launch();

    }
      public static void launch(){
        Scanner scanner = new Scanner(System.in);
        String fruit;

        while(true) {
            System.out.print("\nEnter Fruit name: ");
            fruit = scanner.nextLine().toLowerCase();

            if (fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grape") || fruit.equals("kiwi") || fruit.equals("watermelon")) {
                System.out.println("Is circle: Yes");
                break;
            } else if (fruit.equals("banana") || fruit.equals("strawberry") || fruit.equals("dragon fruit") || fruit.equals("mango")) {
                System.out.println("Is circle: No");
                break;
            } else {
                System.out.println("Fruit name not found.");
            }
        }

        int count;
        while (true){
            System.out.print("\nEnter count: ");
            if(scanner.hasNextInt()){
                count = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid amount.");
                scanner.next();
            }
        }
          System.out.println("-------------------");
          System.out.println("Fruit name: " + fruit);
          System.out.println("Count: " + count);

          scanner.close();
    }
  }

