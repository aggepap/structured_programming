package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εισαγει ο χρήστης έναν ακέραια, και τυπώνει το απόλυτο(abs)
 */
public class AbsoluteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int abs = 0;
        System.out.println("Please insert a num");
        num = scanner.nextInt();

        abs = (num >=0)? num : -num;

        System.out.printf("Absolut of %d is %d", num, abs);
    }
}
