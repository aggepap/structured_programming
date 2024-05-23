package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01ArithmException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;
        while (true) {
            try {
                System.out.println("Please Insert numerator and denominator");
                numerator = input.nextInt();
                if (numerator == 0) break;
                denominator = input.nextInt();

                result = numerator / denominator;

                System.out.printf("%d / %d = %d ", numerator, denominator, result);
            } catch (ArithmeticException e) {
//            e.printStackTrace();
                System.out.println("Error, Denominator cannot be zero");
            } catch (InputMismatchException e) {
                input.nextLine(); //recover
                System.out.println("Please insert an integer");
            }
            System.out.println("Thank you for using our app");

        }
    }
}
