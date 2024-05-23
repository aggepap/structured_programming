package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το a^b
 * */

public class PowerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result =1;

        System.out.println("Please insert a base and a power");
        base = input.nextInt();
        power = input.nextInt();

        for(int i =1 ; i <= power ; i++){
            result *=base;
        }
        System.out.printf("%d ^ %d = %d", base, power, result);
    }
}
