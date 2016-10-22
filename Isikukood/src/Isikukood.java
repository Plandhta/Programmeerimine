import java.util.Scanner;

/**
 * Created by Plandhta on 10/18/2016.
 */
public class Isikukood {
    public static void main(String[] args){
        String täispikknimi;
        int aasta;
        String kuu;
        String päev;
        String sugu;

        Scanner in = new Scanner(System.in);

        int jaanuar, veebruar, märts, april, mai, juuni, juuli, august, september, oktoober,november, detsember;
        jaanuar = 1;
        veebruar = 2;
        märts = 3;
        april = 4;
        mai = 5;
        juuni = 6;
        juuli = 7;
        august = 8;
        september = 9;
        oktoober = 10;
        november = 11;
        detsember = 12;

        System.out.print("Palun sisestage oma ees-ja perekonnanimi: ");
        täispikknimi= in.nextLine();

        System.out.print("Sisestage sugu M/N: ");
        sugu = in.nextLine();
        if (sugu.equals("m") || sugu.equals("M") || sugu.equals("Mees") || sugu.equals("mees"))
            sugu = "3";

        if (sugu.equals("n") || sugu.equals("N") || sugu.equals("Naine") || sugu.equals("naine"))
            sugu = "4";

        System.out.print("Sisestage oma sünniaasta: ");
        aasta = in.nextInt();
        in.nextLine();

        System.out.print("Sisestage oma sünnikuu: ");
        kuu = in.nextLine();
        if (kuu.equals("1") || kuu.equals("jaanuar"))
            kuu = "01";
        if (kuu.equals("2") || kuu.equals("veebruar"))
            kuu = "02";
        if (kuu.equals("3") || kuu.equals("märts"))
            kuu = "03";
        if (kuu.equals("4") || kuu.equals("april"))
            kuu = "04";
        if (kuu.equals("5") || kuu.equals("mai"))
            kuu = "05";
        if (kuu.equals("6") || kuu.equals("juuni"))
            kuu = "06";
        if (kuu.equals("7") || kuu.equals("juuli"))
            kuu = "07";
        if (kuu.equals("8") || kuu.equals("august"))
            kuu = "08";
        if (kuu.equals("9") || kuu.equals("september"))
            kuu = "09";
        if (kuu.equals("oktoober"))
            kuu = "10";
        if (kuu.equals("november"))
            kuu = "11";
        if (kuu.equals("detsember"))
            kuu = "12";

        System.out.print("Sisestage oma sünnipäev: ");
        päev = in.nextLine();
        if (päev.equals("1"))
            päev = "01";
        if (päev.equals("2"))
            päev = "02";
        if (päev.equals("3"))
            päev = "03";
        if (päev.equals("4"))
            päev = "04";
        if (päev.equals("5"))
            päev = "05";
        if (päev.equals("6"))
            päev = "06";
        if (päev.equals("7"))
            päev = "07";
        if (päev.equals("8"))
            päev = "08";
        if (päev.equals("9"))
            päev = "09";

        System.out.print(täispikknimi+ " Teie umbkaudne isikukood on " + sugu + (aasta-1900) + kuu + päev + "xxxx");


    }
}