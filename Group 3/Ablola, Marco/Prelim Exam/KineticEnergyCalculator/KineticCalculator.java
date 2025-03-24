package KineticEnergyCalculator;

import java.util.Scanner;

public class KineticCalculator {
    public static double calculatorKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public static void main(String[] args) {

        while (true) {

            try {


                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter mass in (kg): ");
                double mass = scanner.nextDouble();

                System.out.print("Enter velocity in (m): ");
                double velocity = scanner.nextDouble();

                double kineticEnergy = calculatorKineticEnergy(mass, velocity);

                System.out.println("The objects kinetic energy is: " + kineticEnergy + "J");
                break;
            }

            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a valid input.");

            }

        }
    }
}
