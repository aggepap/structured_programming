package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true/false απο το standard input για δύο δεξαμενές
 * αεροσκάφους. Αν και οι δύο έχουν καύσιμα <1/4, τότε ανάβει
 * κόκκινη ένδειξη. Αν η μία απο τις δύο έχει μικρότερο <1/4 τότε ανάβει
 * πορτοκαλί ένδειξη
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLowTank1 = false;
        boolean isLowTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is less than a quarter");
        isLowTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 2 is less than a quarter");
        isLowTank2 = in.nextBoolean();

//        isOrange = (isLowTank1 && !isLowTank2) || (isLowTank2 && !isLowTank1);
        isOrange = (isLowTank1 ^ isLowTank2);
        isRed = isLowTank1 && isLowTank2;



    }
}
