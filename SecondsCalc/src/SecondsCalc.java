import java.util.Scanner;

/**
 * Created by Plandhta on 10/21/2016.
 */
public class SecondsCalc {
    public static void main(String[]args){

        // arvutab sekundid tundideks, minutiteks ja sekunditeks

        //Skänner lisamine

        Scanner in = new Scanner(System.in);

        // Tokens

        int inSec, hour, sixTen, minute, second;

        // Tokenite väärtus

        sixTen = 60;

        // küsib sekundeid

        System.out.print("Sisestage sekundid numbrites: ");
        inSec = in.nextInt();

        /** % võtab tehtest välja ainult jäägi, ehk 1/3 = 1.333.. jne aga % jaoks on = see 0.333 */

        hour = (inSec/60/60%60);
        minute = (inSec/60%60);
        second = (inSec%60);

        System.out.printf(inSec + " Seconds = %d hours, %d minutes and %d seconds.", hour, minute, second);

    }
}
