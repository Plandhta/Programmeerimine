import java.util.Scanner;

/**
 * Created by Plandhta on 10/22/2016.
 */
public class InchAndCmCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String valik;
        String cm;
        double inchPerCm;
        double cmPerInch;
        double insertInch;
        double insertCm;
        inchPerCm = 2.54;
        cmPerInch = 1;

        System.out.println("To Inch or Cm?");
        valik = in.nextLine();
        if (valik.equals("Inch") || (valik.equals("inch"))) {
            System.out.print("Insert cm: ");
            insertCm = in.nextInt();
            System.out.println(insertCm + " Cm = " + insertCm / inchPerCm + " inches.");
        } else if (valik.equals("Cm") || (valik.equals("cm"))) {
            System.out.println("Insert inches: ");
            insertInch = in.nextInt();
            System.out.println(insertInch + " Inches = " + insertInch * inchPerCm + " Cm.");

        }

    }

}
