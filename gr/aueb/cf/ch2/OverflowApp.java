package gr.aueb.cf.ch2;

/**
 * Ελέγχει για την υπερχείληση σε περίπτωση που συμβεί
 */

public class OverflowApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_000_000_000;
        int num2 = 2_000_000_000;
        int result = 0;
        //Εντολές

        result = num1 + num2;
        System.out.println(result);

    }
}
