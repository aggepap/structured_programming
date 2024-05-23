package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μια απλή διαίρεση. Η διαίρεση με το 0 απαγορεύεται
 * στους ακεραίους της Java. Δίνει ArithmeticException.
 */
public class DivApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numerator = 0;
        int denominator= 0;
        int res = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        if (denominator == 0){
            System.out.println("You cannot divide with 0");
           System.exit(1);

        }else {
            res = numerator/denominator;
            System.out.println("Result= " + res);
        }
    }
}
