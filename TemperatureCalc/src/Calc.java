import java.util.Scanner;

/**
 * Created by Plandhta on 10/21/2016.
 */
public class Calc {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double celsius, farenheit;

        /** Küsib kraade */

        System.out.println("Programm arvutab Celsiusest Farenheide.");
        System.out.print("Sisestage soovitud kraadid: ");
        celsius = in.nextDouble();

        /** arvutab ümber */

        farenheit = celsius * 1.8 + 32;


        System.out.printf("Celsius %.1f = %.1f Farenheit", celsius, farenheit);





    }
}