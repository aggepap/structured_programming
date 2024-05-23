package gr.aueb.cf.ch2;

/**
 * Demo της κλάσης Math
 */

public class myMathApp {


    public static void main(String[] args) {
        int num1 = -10;
        int num2  =3;
        int num3 = 18;

        System.out.println("To απόλυτο του -10 είναι: " + Math.abs(num1));
        System.out.println("Το μικρότερο μεταξύ του 3 και του 18 είναι " + Math.min(num2, num3));
        System.out.println("Το μεγαλύτερο μεταξύ του 3 και του 18 είναι " + Math.max(num2, num3));


    }
}
