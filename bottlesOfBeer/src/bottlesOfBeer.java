import java.util.Scanner;

/**
 * Created by Plandhta on 11/15/2016.
 */
public class bottlesOfBeer {
    public static void beers(int beers) {
        if (beers == 0) {
            System.out.print("No bottles of beer on the wall,\n" +
                    "no bottles of beer ,\n" +
                    "ya' can't take one down, ya' can't pass it around,\n" +
                    "'cause there are no bottles of beer on the wall!\n");
        } else {
            System.out.print(beers + " bottes of beer on the wall,\n" +
                    beers + " bottles of beer,\n" +
                    "ya' take one down, ya' pass it around,\n");
                    beers(beers - 1);
        }
    }

    public static void main(String[]args){
        int beers;
        Scanner in = new Scanner(System.in);
        System.out.println("How many bottles of beer? ");
        beers = in.nextInt();

        beers(beers);

    }
}

