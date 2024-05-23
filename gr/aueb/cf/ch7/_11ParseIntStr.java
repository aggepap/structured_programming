package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Demo of parse int
 */
public class _11ParseIntStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please Insert an int");
        s=in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
