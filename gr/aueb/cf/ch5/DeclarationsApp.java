package gr.aueb.cf.ch5;

/**
 * Declares float/double variables
 */
public class DeclarationsApp {
    public static void main(String[] args) {
        float f = 3.5F;
        double d = 14.8;

        float age = 22F;
        double price = 19D; // οι Ints μετατρέπονται αυτόματα σε float/double, αλλα με τα F/D βοηθάμε τον μεταφραστή να κάνει τον υπολογισμό πιο γρήγορα.

        final float LIGHT_SPEED = 3.0E5F; //(0E5 σημαίνει x 10^5
        final double PI = 3.145;
    }
}
