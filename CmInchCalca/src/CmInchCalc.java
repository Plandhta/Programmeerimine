import java.util.Scanner;

/**
 * Created by Plandhta on 10/19/2016.
 */
public class CmInchCalc {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String ühikud;
        Double arv;
        double inch;
        double cm;
        inch = 2.54;
        cm = 1.0;

        System.out.println("Antud programm arvutab inche ümber sentimeetriteks või vastupidi.");
        System.out.println("Kas soovite ühikuid arvutada sentimeetriteks või inchideks?");
        ühikud = in.nextLine();
        if (ühikud.equals("inchideks") || ühikud.equals("Inchideks")) {
            System.out.print("Sisestage ühikud numbrites: ");
            arv = in.nextDouble();
            System.out.println("Sisestatud ühikud sentimeetrites on: " + (arv / inch));
        }

        else
        if (ühikud.equals("sentimeetriteks") || ühikud.equals("Sentimeetriteks"));
        System.out.println("Sisestage ühikud numbriteks: ");
        arv = in.nextDouble();
        System.out.println("Sisestaud ühikud sentimeetrites on: " + (arv * inch));




    }
}
