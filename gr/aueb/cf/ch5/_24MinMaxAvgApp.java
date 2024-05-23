package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * O χρήστης δίνει μια ακολουθία ακεραίων, που
 * τελειώνει με το 0 και το πρόγραμμα υπολογίζει
 * τα min, max και average.
 *
 */
public class _24MinMaxAvgApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int avg = 0;
        int sum =0;

        System.out.println("Please insert a sequence of integers (0 to end)");
        while ((num = input.nextInt()) !=0) {

            if(num < min){
                min = num;
            }

            if (num > max){
                max = num;
            }
            sum +=num;
            count++;
        }
        System.out.printf("Min:%d , Max: %d , Average: %.2f", min, max, ((double)sum/count));
    }
}
