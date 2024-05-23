package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;

public class _04PrintStreamMethod {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/temp/file6out.txt");

            printMessage(ps, "Hello Coding Factory!"); //Γράφει σε αρχείο
            printMessage(System.out, "Hello Coding Factory!"); //Το System out είναι print stream, περνάει για παράμετρος.
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Generic Print Method
     * @param ps  The printstream
     * @param message  The message to print
     */
    public static void printMessage(PrintStream ps, String message){
        ps.println(message);
    }
}
