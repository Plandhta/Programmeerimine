/**
 * Created by Plandhta on 10/22/2016.
 */
public class Methods {
    public static void zool(int age, String pet, String street){
        System.out.print("I am " + age + " years old.\n" + "The name of my first pet was " + pet + ".\n" + "I grew up on " + street + " street.");
    }

    public static void printAmerica(String a, String day, int date, String month, int year, String s){
        System.out.println(a);
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println(s);
    }

    public static void main(String[]args){
        String päev = "Laupäev";
        String kuu = "Oktoober";
        int aasta = 2016;
        int kuupäev = 22;
        String vers = "American format:";
        String vers2 = "European format:";
        String vahe = " ";

        printAmerica(vers, päev, kuupäev, kuu, aasta, vahe);
        printEuropean(vers2, päev, kuupäev, kuu, aasta, vahe);


        int vanus = 19;
        String tänav = "Uus";
        String lemmikloom = "Kratt";

        zool(vanus, lemmikloom, tänav);
    }

    public static void printEuropean(String a, String day, int date, String month, int year, String b){
        System.out.println(a);
        System.out.println(day + " " + date + " " + month + " " + year);
        System.out.println(b);
    }
}
