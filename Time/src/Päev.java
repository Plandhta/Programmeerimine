/**
 * Created by Plandhta on 10/22/2016.
 */
public class Päev {
    public static void main(String[]args){
        String day;
        String month;
        int year;
        int date;

        day = "Wednesday";
        month = "October";
        year = 2016;
        date = 19;

        System.out.println("Todays is " + day + " the " + date +"th" + " of " + month + " " + year);

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European format:");
        System.out.print(day + " " + date + " " + month + " " + year);
    }
}

