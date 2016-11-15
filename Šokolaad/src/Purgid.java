import java.util.Scanner;

/**
 * Created by Plandhta on 10/24/2016.
 */
public class Purgid {
    public static void main(String[]args,double kg, double sotti, double kaksSotti, double kolmSotti) {

        /** Sokolaadi valik */

        Scanner in = new Scanner(System.in);

        String sokolaad;

        System.out.print("Classical/Musical/Symphony\nVali: ");
        sokolaad = in.nextLine();


        if (sokolaad.equals("Classical")  || sokolaad.equals("classical"))
            vahekord(kg, sotti, kaksSotti, kolmSotti);
    }

    public static void vahekord(double kg, double sotti, double kaksSotti, double kolmSotti){

        /** Vahekorra arvutaja */

        Scanner in = new Scanner(System.in);

        double sajased, kahesSajased, neljaSajased, sajasedKokku;
        double vahe1, vahe2, vahe3;

        System.out.println("");
        System.out.println("Sisestage purkide vahekord.");
        System.out.print("100g purke = ");
        sajased = in.nextDouble()*100;
        System.out.print("200g purke = ");
        kahesSajased = in.nextDouble()*200;
        System.out.print("400g purke = ");
        neljaSajased = in.nextDouble()*400;

        sajasedKokku = sajased+kahesSajased+neljaSajased;

        vahe1 = (sajased/sajasedKokku)/0.1;
        vahe2 = (kahesSajased/sajasedKokku)/0.2;
        vahe3 = (neljaSajased/sajasedKokku)/0.4;

        double vaheÜks = (int) vahe1, vaheKaks = (int) vahe2, vaheKolm = (int) vahe3;
        double jääk = ((vahe1-vaheÜks)*100) + ((vahe2-vaheKaks)*200) + ((vahe3-vaheKolm)*400);
        kg(kg, sotti, kaksSotti, kolmSotti);
        sotti = ((int)(vahe1*kg));
        kaksSotti = ((int)(vahe2*kg));
        kolmSotti = ((int)(vahe3*kg));

        System.out.printf("Üle jääb: %.2f g",jääk);

    }

    public static void kg(double kg, double sotti, double kaksSotti, double kolmSotti){

        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.print("Sisesta kg: ");
        kg = in.nextDouble();

        vahekord(kg, sotti, kaksSotti, kolmSotti);

        System.out.println("");
        System.out.println("100g purke " + sotti + "\n200g purke " + kaksSotti + "\n400g purke " + kolmSotti);
    }

    public static void classicHind(){

        /** Classicud hinnakiri */


    }

}
