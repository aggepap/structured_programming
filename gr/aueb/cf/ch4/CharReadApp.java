package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Demo of reading a char
 * 1.System.in.read() -> returns int(byte)
 * 2.
 */
public class CharReadApp {
    public static void main(String[] args) throws IOException {
        int inputChar1 = ' ';
        int inputChar2 = ' ';
        Scanner in  = new Scanner(System.in);

        System.out.println("Please insert a ASCII Char");
    inputChar1 = System.in.read();

        System.out.println("ordinal: "+ (char) inputChar1);
        System.out.println("Char: "+ inputChar1);

        System.out.println("Please insert a unicode Char");
        inputChar2  = in.nextLine().charAt(0);
        System.out.println("Unicode char:" + inputChar2);
    }
}
