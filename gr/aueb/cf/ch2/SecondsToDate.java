package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *
 * Δέχεται input με ακεραιο που συμβολίζει δευτερόλεπτα, και τα μετατρέπει σε λεπτά/ώρες/ημέρες/
 * και υπολοιπόμενο δευτερόλεπτα.
 */

public class SecondsToDate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SEC_PER_MINUTE = 60;
        final int SEC_PER_HOURS = 3600;
        final int SEC_PER_DAY = 24 * 3600;
        int days=0;
        int hours=0;
        int minutes=0;
        int inputSeconds=0;
        int remainingSec = 0;

        System.out.println("Please insert time in seconds");
        inputSeconds = in.nextInt();

        days = inputSeconds/SEC_PER_DAY;
        remainingSec = inputSeconds % SEC_PER_DAY;

        hours = remainingSec /SEC_PER_HOURS;
        remainingSec %= SEC_PER_HOURS;

        minutes = remainingSec /SEC_PER_MINUTE;
        remainingSec %= SEC_PER_MINUTE;

        System.out.printf("The %d Seconds are %d days, %02d hours, %02d minutes and %02d seconds", inputSeconds, days, hours, minutes, remainingSec);


    }
}
