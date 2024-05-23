package gr.aueb.cf.ch2;

/**
 * Εμφανίζει τους τύπους δεδομένων ακεραίων(int,short,byte,long), και τα χαρακτηριστικά τους(μέγεθος, bits, μέγιστη & ελάχιστη τιμή)
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %d bits, Min: %,d , Max: %,d\n", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d , Max: %d\n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d , Max: %d\n", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d , Max: %,d\n", Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        int x = 2;
        int z = 4;
        float res=0;

        res = x / z;
        System.out.println(res);
    }
}
