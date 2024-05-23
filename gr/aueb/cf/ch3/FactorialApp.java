package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του ν
 * δηλ n! = 1*2*3...*n
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mul =1;
        int i =1;
        int n=0;

        System.out.println("Please insert n");
        n = in.nextInt();
        while(i <= n) {

            mul *= i;
            i++;
        }
            System.out.println(mul);
        }
}
