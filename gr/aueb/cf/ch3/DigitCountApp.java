package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου, με do/while.
 * Για παράδειγμα, αν ο χρηστης δώσει το 259 , τότε το πλήθος των
 * ψηφίων θα είναι 3.
 */
public class DigitCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigits = 0;
        int rightHandDigit = 0;

        System.out.println("Please insert a number");
        num = in.nextInt();

        copyOfNum = num;

        do {

            count++;
            rightHandDigit = copyOfNum % 10;
            sumOfDigits += rightHandDigit;
            copyOfNum /= 10;
        }while (copyOfNum !=0);

        System.out.printf("digitcount is %d and sum of digits is %d", count, sumOfDigits);

    }
}
