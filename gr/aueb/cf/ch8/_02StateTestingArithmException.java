package gr.aueb.cf.ch8;

import java.util.Scanner;

public class _02StateTestingArithmException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

            System.out.println("Please Insert numerator and denominator");
            numerator = input.nextInt();
            denominator = input.nextInt();
if(denominator == 0) {
    System.out.println("denominator cannot be zero");
    System.exit(1);
}
            result = numerator / denominator;

            System.out.printf("%d / %d = %d ", numerator, denominator, result);
    }
}
