package gr.aueb.cf.ch2;

/**Προσθέτει 2 ακεραίους και εμφανίζει το
 * αποτέλεσμα στην κονσόλα (Standard output)
 */


public class AddApp {

    public static void main(String[] args) {

//        Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5, num2 = 7, sum= 0;


        //Εντολές
        sum = num1 + num2;

//        Εκτύπωση αποτελεσμάτων
        System.out.println("Το αθροισμα των " + num1 + " και " + num2 +" ισούτε με " +sum);
        System.out.printf("To άθροισμα των %d και %d είναι: %d", num1, num2, sum);
    }
}



