import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        int userGuess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the correct number, which is " + randomNumber);
                System.out.println("You took " + numberOfTries + " tries.");
            }
        } while (userGuess != randomNumber);
        
        scanner.close();
    }
}
