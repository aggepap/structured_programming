package gr.aueb.cf.ch2;

import java.util.Locale;

/**
 * Output Demo
 */

public class OutputApp {
    public static void main(String[] args) {
        int num =10;
        long num2 = 20215442;
/*        System.out.println("Hello");
        System.out.print("Hello2");
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);*/
        System.out.printf(Locale.US, "Num is %05d Num1 is %,05d", num, num2);
    }
}
