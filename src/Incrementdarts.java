import java.util.Scanner;

/**
 * Created by Adam on 6/28/2016. Question 4
 */
public class Incrementdarts {
    public static void main(String[] args){
        double incircle=0,insqaure=0;

        Scanner scan = new Scanner(System.in);
        int startdartamt,enddartamt,increment;
        System.out.print("Starting amount of darts: ");
        startdartamt = scan.nextInt();
        System.out.println("Ending amount of darts: ");
        enddartamt=scan.nextInt();
        System.out.println("Increment to Increase");
        increment=scan.nextInt();

        for (int currentdartamt=startdartamt ; currentdartamt<enddartamt ; currentdartamt+=increment) {
            for (int k=0 ; k < currentdartamt ; k++) {
                double dartx,darty,distance;
                dartx=Math.random()*2.0;
                darty=Math.random()*2.0;
                distance = Math.hypot(dartx-1.0, darty-1.0);
                if (Math.abs(distance)<=1.0){
                    incircle++;
                    insqaure++;
                } else {
                    insqaure++;
                }
            }
            double picalc=(incircle/insqaure)*4;
            System.out.println(currentdartamt + " darts gets us - " + picalc);
        }

    }
}
