import java.util.Scanner;

/** Converter
 * 21.10.2016
 */

public class CmFeetCalc {
    public static void main(String[]args){

        double cm;
        int inches, feet, remainder;
        final double CM_PER_FOOT = 2.54;
        final double INCH_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        /** Küsib kasutajalt mitu ühikt */
        System.out.println("Sisestage täpne arv sentimeetreid?");
        cm = in.nextDouble();

        /** Arvuta ümber (100) */

        inches = (int) (cm / CM_PER_FOOT);
        feet = (int) (inches / INCH_PER_FOOT);
        remainder = (int) (inches % INCH_PER_FOOT);

        /** Trükib vastuse välja */

        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);


    }
}