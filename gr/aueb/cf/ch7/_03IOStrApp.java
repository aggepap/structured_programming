package gr.aueb.cf.ch7;

import java.util.Scanner;

public class _03IOStrApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two Strings");

        s1 = input.next(); // Διαβάζει μέχρι να βρει whitespaces ή \t ή \n
        s2 = input.nextLine(); // Διαβάζει μέχρι να βρεί \n . Το καταναλώνει, αλλα δεν το απόδιδει.

        System.out.printf("S1: %s\n", s1);
        System.out.printf("S2: %s\n", s2);

    }
}
