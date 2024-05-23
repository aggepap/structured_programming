package gr.aueb.cf.ch5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα τρίγωνο είναι ορθογώνιο, με βάση
 * την εισαγωγή 3 δεκαδικών απο τον χρήστη, που αναπαριστούν
 * τις τρεις πλευρές ενός τριγώνου.
 */

public class _05RightTriangleApp {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    final double EPSILON = 0.00005;
    double a = 0.0; //υποτείνουσα
    double b = 0.0;
    double c = 0.0;
    boolean isRight = false;

        System.out.println("Παρακαλώ εισάγετε τις τρείς πλευρές του τριγώνου:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;
        System.out.println("Triangle is right "+ isRight);
}
}