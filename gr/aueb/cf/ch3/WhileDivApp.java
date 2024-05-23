package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * O χρήστης εισάγει δύο ακεραίους μέχρι ο αριθμητής να είναι 0
 * Το πρόγραμμα ελέγχει τον παρονομαστή, αν ειναι 0 , και αν ειναι
 * δίνει τη δυνατότητα στο χρήστη να συνεχίσει, δίνοντας
 * παρονομαστή διαφορο του μηδενός.
 */
public class WhileDivApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int res = 0;

        while (true){
            System.out.println("Please insert two integers for division");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if(numerator == 0){
                System.out.println("Numerator cannot be 0");
                break;
            }
            if(denominator ==0){
                System.out.println("Denominator cannot be 0");
                continue;
            }
            res =numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, res);


        }

        System.out.println("Thanks for using our app");
    }

}
