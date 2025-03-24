package BMI;

import java.util.Scanner;

public class BMICalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        float bmi = calculateBmi(height, weight);

        BMICalculator bmiCalculator = new BMICalculator();
        String categoryBmi = bmiCalculator.getBmiCategory(bmi);

        System.out.println("\nBMI: " + bmi);
        System.out.println("BMI Category: " + categoryBmi);

    }

    public static float calculateBmi(double height, double weight) {
        return (float) (weight / (height * height));
    }

    public String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 24.9 && bmi <= 29.9) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        }
        return "Invalid BMI";
    }
}