package AttackCalculator;

import java.util.Scanner;

public class AttackSpeedCalculator {
    public static void main(String []args){

    while (true){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the base attack speed: ");
            double baseAttackSpeed = scanner.nextDouble();

            System.out.print("Enter the bonus attack speed %: ");
            double bonusAttackSpeedPercent =  scanner.nextDouble();

            double bonusAttackSpeed = bonusAttackSpeedPercent / 100;

            System.out.print("Enter the level: ");
            int level = scanner.nextInt();

            double currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeed * (level - 1)));

            currentAttackSpeed = Math.round(currentAttackSpeed * 1000.0) / 1000.0;

            System.out.println("The character's current attack speed is: " + currentAttackSpeed);

            break;

        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter a valid input.");
        }
    }
  }

}
