package gr.aueb.cf.ch4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Γενική μορφή της For
 */

public class GenericFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations =0;
        System.out.println("Please insert start value, end value , step");
        startValue = input.nextInt();
        endValue = input.nextInt();
        step = input.nextInt();

        for(int i= startValue; i<= endValue;i+=step) {
            iterations++;
            System.out.println("i:" + i + " ");
        }
        System.out.println("Iterations " + iterations );
    }
}
