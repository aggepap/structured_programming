package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^b με big interger
 */

public class BigIntPowerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        System.out.println("Please insert two intergers");
        base = BigInteger.valueOf(input.nextInt());
        power = BigInteger.valueOf(input.nextInt());
        for (int i = 1; i<= power.intValue(); i++ ){
            result = result.multiply(base);
        }
        System.out.printf("%d ^ %d = %,d", base, power, result);
    }
}
