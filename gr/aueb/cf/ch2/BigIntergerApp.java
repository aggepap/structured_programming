package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την BigInterger ωστε να αποφύγουμε την υπερχείληση (Overflow)
 */

public class BigIntergerApp {
    public static void main(String[] args) {
        BigInteger myBigInt = new BigInteger("1242512534512345125423412412512421521");
        BigInteger myBigInt2 = new BigInteger("1242512534512345125423412412512421521");

        BigInteger result = myBigInt.add(myBigInt2);
        System.out.println(result);

    }

}