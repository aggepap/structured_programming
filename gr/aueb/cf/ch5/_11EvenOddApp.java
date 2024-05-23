package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή περιττος με τη χρήση
 * μεθόδων.
 */
public class _11EvenOddApp {
    public static void main(String[] args) {
        int inputNumber = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert a number");
        inputNumber = input.nextInt();

        System.out.printf("%d is even: %b", inputNumber , isEven(inputNumber));


    }

    /**
     * Evaluates if an inpit is even
     * @param a the input
     * @return true if even, false, otherwise
     */
    public static boolean isEven(int a){
        return a % 2 ==0;
    }

}
