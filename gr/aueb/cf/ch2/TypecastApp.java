package gr.aueb.cf.ch2;

/**
 *
 * Επιδεικνύει τις μετατροπες μεταξύ διαφορετικών τύπων δεδομένων
 */


public class TypecastApp {
    public static void main(String[] args) {
int myInt = 10;
long myLong = 20L;
int myResultInt =0;
long myResultLong = 0L;

    myLong = myInt; //Auto Widening, auto typecast
    myInt = (int)myLong; //Typecast
    myResultInt = (int) (myInt + myLong);

        System.out.println(myInt);
    }
}
