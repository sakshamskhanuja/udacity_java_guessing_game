import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates a random number from 1 to 100.
        int random = new Random().nextInt(101);

        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Stores whether user has guessed the number correctly.
        boolean userWon = false;

        // Start game.
        System.out.println("I have randomly chosen a number between [1, 100]\nTry to guess it.");
        for (int i = 10; i > 0; i--) {
            try {
                if (i == 1) {
                    System.out.println("Last guess: ");
                } else {
                    System.out.println("You have " + i + " guess(es) left:");
                }
                int userInput = Integer.parseInt(scanner.nextLine());

                if (userInput == random) {
                    System.out.println("\nCORRECT ... YOU WON!");
                    userWon = true;
                    break;
                } else if (userInput > random) {
                    if (i == 1) {
                        break;
                    }
                    System.out.println("\nIt's smaller than " + userInput + ". Choose again.");
                } else {
                    if (i == 1) {
                        break;
                    }
                    System.out.println("\nIt's greater than " + userInput + ". Choose again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEnter a number. Try again.\n");
                i++;
            }
        }

        if (!userWon) {
            System.out.println("\nTry again next time. The number was " + random + ".");
        }

        // Closes the scanner.
        scanner.close();
    }
}