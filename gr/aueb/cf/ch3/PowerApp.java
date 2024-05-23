package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το base^power.
 * O χρήστης εισάγει τα base & power.
 */
public class PowerApp {

    //Δήλωση και αρχικοποίηση μεταβλητών

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int res = 1;
        int i = 1;

        System.out.println("Please insert base value(interger");
        base = in.nextInt();
        System.out.println("Please insert power value(interger");
        power = in.nextInt();

        while(i <=power){
            res *= base;
            i++;
        }
        System.out.printf("%d ^ %d = %,d", base, power, res);
        System.out.printf("2 ^ 8 = %d",(int) Math.pow(2, 8));
    }
}
