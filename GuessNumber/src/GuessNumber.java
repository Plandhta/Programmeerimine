import java.util.Random;
import java.util.Scanner;

/**
 * Created by Plandhta on 10/22/2016.
 */
public class GuessNumber {
    public static void main(String[]args){

        // variables
        int number;
        int guess;

        Random random = new Random();
        number = random.nextInt(100) +1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Im thinking of a number between 1 and 100.");
        System.out.print("Guess my number: ");
        guess = scanner.nextInt();
        System.out.println("You guessed: " + guess);
        System.out.println("The number I was thinking of was " + number);
        if (guess == number) {
            System.out.println("You guessed right!");
        }
        else
            if (guess < number)
                System.out.println("You guessed wrong. You were off by "+ ((number-guess)*+1));
            if (guess > number)
                System.out.println("You guessed wrong. You were off by "+ (guess-number));




    }
}