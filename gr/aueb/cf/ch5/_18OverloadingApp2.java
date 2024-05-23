package gr.aueb.cf.ch5;

/**
 * Demonstrates Overloading (υπερφόρτωση)
 * Υπερφόρτωση  = ίδιο όνομα μεθόδου, με διαφορετικές τυπικές παραμέτρους.
 * Method Signature = άνομα μεθόδου ΣΥΝ τις τυπικές παραμέτρους
 */

public class _18OverloadingApp2 {
    public static void main(String[] args) {

        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1,2);
        sum3 = add(1,2,3);
        sum4 = add(1,2,3,4);

    }

    /**
     *  Adds two integers
     * @param a  First int
     * @param b  Second Int
     * @return  The sum of the two ints
     */
    public static int add(int a , int b){
        return a + b;
    }
    /**
     *  Adds three integers
     * @param a  First int
     * @param b  Second Int
     * @param c  Third Int
     * @return  The sum of the three  ints
     */
    public static int add (int a, int b, int c){
        return a + b+ c;
    }

    /**
     *  Adds four integers
     * @param a  First int
     * @param b  Second Int
     * @param c  Third Int
     * @param d  forth Int
     * @return  The sum of the three  ints
     */
    public static int add (int a, int b, int c,int d){
        return a + b + c + d;
    }
}
