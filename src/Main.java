import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double incircle=0,insqaure=0;

        Scanner scan = new Scanner(System.in);
        int dartamt;
        System.out.print("Amount of darts: ");
        dartamt = scan.nextInt();

        for (int k=0 ; k < dartamt ; k++) {
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
        System.out.println(picalc);



    }
}
