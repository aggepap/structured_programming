package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει του θετικούς αριθμούς που δίνει ο χρήστης, μέχρι να δώσει αρνητικό
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= 0;
        int positivesCount =0;

        System.out.println("Please insert a num(0 to exit)");
//        num = in.nextInt();

        while ((num = in.nextInt()) >=0 ){
            positivesCount++;

            System.out.println("Please insert a num(0 to exit)");
//            num = in.nextInt();
        }
        System.out.println("Positives Count = " + positivesCount);
    }
}
