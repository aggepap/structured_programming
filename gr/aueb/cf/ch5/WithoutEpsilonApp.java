package gr.aueb.cf.ch5;

/**
 * Show the problem with the floating numbers.
 */

public class WithoutEpsilonApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i<=10; i++){
            actual += 0.1;
        }
        System.out.println(actual);
    }
}
