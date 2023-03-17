import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // generates a random number between 1 and 100
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("I'm thinking of a number between 1 and 100. You have 10 tries to guess it.");

        while (numberOfTries < 10) {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

        if (win) {
            System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
        } else {
            System.out.println("Sorry, you ran out of tries. The number I was thinking of was " + numberToGuess + ".");
        }

        scanner.close();
    }
}