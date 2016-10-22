/**
 * Created by Plandhta on 10/22/2016.
 */
public class Kell2 {
    public static void main(String[]args){
        int hour;
        int second;
        int minute;
        int ööpäev;
        int minutid;
        int sekundid;
        int protsent;


        hour = 15;
        minute = 06;
        second = 21;
        ööpäev = 24;
        minutid = 60;
        sekundid = 60;
        protsent = 100;


        double seconds1 = (((ööpäev-hour)*minutid*sekundid) + (minute*sekundid) + second);
        double seconds2 = (hour*minutid*sekundid+minute*sekundid+second);
        double seconds3 = (ööpäev*minutid*sekundid);
        double seconds4 = (seconds2 / seconds3 *protsent);
        double seconds5 = (protsent-seconds4);



        System.out.println("Time is " + hour + ":" + minute + ":" + second);
        System.out.println("Time until midnight in seconds is " + seconds1);
        System.out.println("Time in seconds from last midnight is " + seconds2);
        System.out.println("There are " + seconds3 + " seconds in 24hours(1day)");
        System.out.println(seconds4 + "% päevast on läbi!");
        System.out.println("Päeva on jäänud veel " + seconds5 + "%");


    }
}
