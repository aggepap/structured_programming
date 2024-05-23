package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateToSecApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SEC_PER_MINUTE = 60;
        final int SEC_PER_HOURS = 3600;
        final int SEC_PER_DAY = 24 * 3600;
        int days =0;
        int hours=0;
        int minutes=0;
        int seconds =0;

        System.out.println("Please enter days, hours, minutes and seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();

        int daysSecs = days * SEC_PER_DAY;
        int hoursSecs = hours *SEC_PER_HOURS;
        int minuteSecs = minutes * SEC_PER_MINUTE;
        int totalSecs = daysSecs + hoursSecs + minuteSecs + seconds;



        System.out.printf("%d days, %d hours, %d minutes and %d seconds are %,d seconds at total",days,hours, minutes, seconds, totalSecs );

    }
}
