import java.util.Random;
import java.util.Scanner;

/**
 * Created by Plandhta on 11/15/2016.
 */
public class NewGuessMyNumber {

    public static void main(String[]args){
        System.out.println("Im thinking of a number between 1 and 100.");
        generator();
    }

    public static void generator(){
        int number;
        Random random = new Random();
        number = random.nextInt(100) + 1;
        guess(number);
    }

    public static void guess(int random){
        int firstGuess;
        Scanner in = new Scanner(System.in);
        System.out.print("Guess my number: ");
        firstGuess = in.nextInt();
        control(random, firstGuess);
    }

    public static void control(int arv, int arvamus) {

        if (arvamus == arv) {
            System.out.print("You guessed right!");
        } else {
            if (arvamus < arv) {
                System.out.println("You guessed wrong. Your guess was too low.\nGuess again!");
                guess(arv);
            }
            if (arvamus > arv) {
                System.out.println("You guessed wrong. Your guess was too high.\nGuess again!");
                guess(arv);
            }
        }

    }
}
