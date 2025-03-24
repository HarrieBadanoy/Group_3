package PrelimExam.RockPaperScissor;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args){

        while (true) {

            String[] selections = new String[]{"Rock", "Paper", "Scissor"};
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter (Rock, Paper, Scissor): ");
            String playerGuess = scanner.nextLine();

            if (!isValidChoice(playerGuess, selections)) {
                System.out.println("Invalid Input! ");
                continue;
            }

            String computerGuess = computerGuess(selections, random);
            System.out.println("Computer chose: " + computerGuess);

            if (isTied(playerGuess, computerGuess)) {
                System.out.println("Tied");
            } else if (isPlayerWinner(playerGuess, computerGuess)) {
                System.out.println("Player Wins");
                break;
            } else {
                System.out.println("Computer Wins");
            }
        }
    }

    public static boolean isValidChoice(String playerGuess, String[] selections){
        for(String choice:selections){
            if(choice.equalsIgnoreCase(playerGuess)){
                return true;
            }
        }
        return false;
    }

    public static String computerGuess(String[] selections, Random random){
        return selections[random.nextInt(selections.length)];
    }

    public static boolean isTied(String playerGuess, String computerGuess){
        return playerGuess.equalsIgnoreCase(computerGuess);
    }

    public static boolean isPlayerWinner(String playerGuess, String computerGuess){
        return (playerGuess.equalsIgnoreCase("Rock") && computerGuess.equalsIgnoreCase("Scissor")) ||
                (playerGuess.equalsIgnoreCase("Paper") && computerGuess.equalsIgnoreCase("Rock")) ||
                (playerGuess.equalsIgnoreCase("Scissor") && computerGuess.equalsIgnoreCase("Paper")) ||

                (playerGuess.equalsIgnoreCase("rock") && computerGuess.equalsIgnoreCase("scissor")) ||
                (playerGuess.equalsIgnoreCase("paper") && computerGuess.equalsIgnoreCase("rock")) ||
                (playerGuess.equalsIgnoreCase("scissor") && computerGuess.equalsIgnoreCase("paper"));
    }

    public static boolean isComputerWinner(String playerGuess, String computerGuess){
        return (computerGuess.equalsIgnoreCase("Rock") && playerGuess.equalsIgnoreCase("Scissor")) ||
                (computerGuess.equalsIgnoreCase("Paper") && playerGuess.equalsIgnoreCase("Rock")) ||
                (computerGuess.equalsIgnoreCase("Scissor") && playerGuess.equalsIgnoreCase("Paper")) ||

                (computerGuess.equalsIgnoreCase("rock") && playerGuess.equalsIgnoreCase("scissor")) ||
                (computerGuess.equalsIgnoreCase("paper") && playerGuess.equalsIgnoreCase("rock")) ||
                (computerGuess.equalsIgnoreCase("scissor") && playerGuess.equalsIgnoreCase("paper"));
    }
}
