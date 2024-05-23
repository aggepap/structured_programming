package gr.aueb.cf.ch5;

/**
 * Ο τρόπος να διορθώσουμε το σφάλμα σύγκρισης των δεκαδικών
 */

public class _04EpsilonApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;
        final double EPSILON = 0.000005; //βαθμός σημαντικότητας

        for(int i = 1; i<= 10; i++) {
            actual += 0.1;
        }
        System.out.printf("Actual : %.20f\n", actual);
        System.out.printf("Expected : %.20f\n", expected);
        if (Math.abs(actual - expected) <= EPSILON){
            System.out.println("EQUAl");
        }else{
            System.out.println("NOT EQUAL");
        }
    }
}
