import java.util.Scanner;

/**
 * Created by Plandhta on 10/23/2016.
 */
public class Purk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double kg;
        double jääk1;
        double jääk2;
        double jääk3;
        String vahekorraValik;

        double vahekord1;
        double vahekord2;
        double vahekord3;
        double vahekord4;
        double vahekordA, vahekordB, vahekordC;

        System.out.println("Kas kasutada tavalist vahekorda 100=10=2 või siestada ise?(Kirjuta sisesta või tavaline.)");
        vahekorraValik = in.nextLine();
        if (vahekorraValik.equals("siesta")) {
            System.out.print("Siesta vahekord.\nMitu 100g purki? : ");
            vahekord1 = in.nextDouble();
            System.out.print("Mitu 200g purki? : ");
            vahekord2 = in.nextDouble();
            System.out.print("Mitu 400g purki? : ");
            vahekord3 = in.nextDouble();

            vahekord4 = (vahekord1 * 100) + (vahekord2 * 200) + (vahekord3 * 400);

            vahekordA = vahekord1 / vahekord4;
            vahekordB = vahekord2 / vahekord4;
            vahekordC = vahekord3 / vahekord4;
        } else if (vahekorraValik.equals("tavaline")) {
            System.out.print("Siesta kg: ");
            kg = in.nextDouble();
            double sajane = (int) (kg * (0.78125 / 0.1));
            double kaheSajane = (int) (kg * (0.15625 / 0.2));
            double neljaSajane = (int) (kg * (0.0625 / 0.4));

            //VAHE

            //jääk1
            double sajane2 = (kg * (0.78125 / 0.1)) - sajane;

            //jääk2
            double kaheSajane2 = (kg * (0.15625 / 0.2)) - kaheSajane;

            //jääk3
            double neljaSajane2 = (kg * (0.0625 / 0.4)) - neljaSajane;
            ;

            double jääk = (sajane2 * 100) + (kaheSajane2 * 200) + (neljaSajane2 * 400);

            System.out.println(kg + " kg:\n" + sajane + " 100g purki\n" + kaheSajane + " 200g purki\n" + neljaSajane + " 400g purki\n");
            System.out.printf("Jääk = %.2f grammi\n", jääk);
            System.out.println(sajane2);
            System.out.println(kaheSajane2);
            System.out.println(neljaSajane2);

        }
    }
}

