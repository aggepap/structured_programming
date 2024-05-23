package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη ένα ακέραιο που συμβολίζει ένα ποσό σε ευκό και το
 * μετατρέπει με βάση κάποια ισοτιμία (parity) σε USD και US Cents
 */
public class EuroToUSConverter {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int euros;
        final int PARITY= 99;
        int usd;
        int totalCents;
        int RemainingCents;

        //input
        System.out.println("Please insert the amount in Euro");
        euros = in.nextInt();

        //Εντολές

        totalCents= euros * PARITY ;
        usd = totalCents / 100;
        RemainingCents = totalCents % 100;


        System.out.printf("Τα %,d ευρώ είναι %,d δολλάρια και %d Cents", euros,usd,RemainingCents);

    }
}
