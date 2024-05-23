package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Ελέγχει τα φώτα ενός αυτοκινήτου, ωστε να ανάβουν όταν βρέχει
 *  και ταυτόχρονα, είτε είναι σκοτάδι, είτε τρέχει με υψηλή ταχύτητα.
 *  Ο χρήστης εισάγει τα τρία παραπάνω δεδομένα (παρουσία βροχή, σκοτάδι, ταχύτητα οχήματος)
 *  και το πρόγραμμα εκτυπώνει το αν τα φώτα ανάβουν ή όχι
 *
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        final int MAX_SPEED = 120;
        int movingSpeed =0;
        boolean areLightsOn = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert moving speed(interger)");
        movingSpeed = in.nextInt();

        areLightsOn = isRaining && (isDark || (movingSpeed > MAX_SPEED));

        System.out.println("areLightsOn = " +  areLightsOn);

    }
}
