import java.util.Scanner;

/**
 * Created by Plandhta on 10/24/2016.
 */
public class Purgidd{
    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);

        String valik;
        double vahe1, vahe2, vahe3, vahekokku, vaheProt1, vaheProt2, vaheProt3, kg, purke1, purke2, purke3;
        double jääk, jääk1, jääk2, jääk3;
        double classic1, classic2, classic3;

        classic1 = 0.68; classic2 = 1.0; classic3 = 1.8;


        System.out.println("Classical/Musical/Symphony");
        valik = in.nextLine();
        if (valik.equals("Classic") || valik.equals("classic") || valik.equals("Classical") || valik.equals("classical")) {
            System.out.println("Valisite Classicu");
            text();
            System.out.println("Sisestage vahekord.");
            System.out.print("100g purke ");
            vahe1 = in.nextDouble()*100; // arvutab 100g purkide kilod kokku
            System.out.print("200g purke ");
            vahe2 = in.nextDouble()*200; // arvutab 200g purkide kilod kokku
            System.out.print("400g purke ");
            vahe3 = in.nextDouble()*400; // arvutab 400g purkide kilod kokku
            text();

            vahekokku = vahe1 + vahe2 + vahe3; // arvutab kõikide purkide kilod kokku

            vaheProt1 = vahe1/vahekokku; // arvutab mitu % 100g purke
            vaheProt2 = vahe2/vahekokku; // arvutab mitu % 200g purke
            vaheProt3 = vahe3/vahekokku; // arvutab mitu % 400g purke

            System.out.print("Siestage kg: "); // võtab inputi mitu kg sokolaadi valmistada
            kg = in.nextDouble();

            text();

            purke1 = (int) (kg*vaheProt1/0.1); // arvutab mitu 100g purki
            purke2 = (int) (kg*vaheProt2/0.2); // arvutab mitu 200g purki
            purke3 = (int) (kg*vaheProt3/0.4); // arvutab mitu 400g purki

            jääk1 = ((kg*vaheProt1/0.1) - purke1)*100; //arvutab mitu g jääb järgmisest 100g purgist puudu ehk siis jääk
            jääk2 = ((kg*vaheProt2/0.2) - purke2)*200; // 200g purgi jääk
            jääk3 = ((kg*vaheProt3/0.4) - purke3)*400; // 400g purgi jääk
            jääk = jääk1+jääk2+jääk3; // kui palju on jääk kokku

            System.out.println("100g purke: " + purke1 + " = " +(int)(classic1*purke1) + " €"); // prindib kui palju purke
            System.out.println("200g purke: " + purke2 + " = " + (classic2*purke2) + " €");
            System.out.println("400g purke: " + purke3 + " = " + (classic3*purke3) + " €");
            System.out.printf("Alles jääb %.2fg\n", jääk); // prindib kui suur on jääk, ümardab 2 koma kohani.
            System.out.printf("Kokku %.2f €", ((classic1*purke1)+(classic2*purke2)+(classic3*purke3)));







        }





    }

    public static void text() {
        System.out.println();
    }
}
