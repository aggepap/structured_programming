package gr.aueb.cf.ch5;

/**
 * Ανταλλάσει αμοιβαία τις τιμές δύο ακεραίων.
 */

public class _09SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a: %d, b: %d\n", a,b);
        swap(a,b);
        System.out.printf("a: %d, b: %d", a,b);
    }

    /**
     * Mutually interchanges the values
     * of two integers
     * @param a     The first integer
     * @param b     The second integer
     */
    public static void swap( int a , int b){
int temp = a;
a = b;
b = temp;
    }

}
