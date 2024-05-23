package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1, num2, sum;

        //Εντολές
        System.out.println("Please insert 2 numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        //Εκτύπωση στην κονσόλα
        System.out.printf("To αποτέλεσμα του %d + %d είναι %,d", num1, num2, sum);
    }
}
