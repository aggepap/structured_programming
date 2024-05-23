package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μια θερμοκρασία που έχει λάβει ως ακέραιο στο Standard Input
 * και λαμβάνει υπόψιν του την παρουσία ή όχι βροχής (boolean) και αποφασίζει
 * αν χιονίζει (παρουσία βροχή + θερμοκρασία <0)
 *@author Aggelos
 */

public class SnowingApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση εντολών
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing= false;
        //Εντολες
        System.out.println("Please insert in it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert outside temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp<0);
        System.out.println("Is Snowing " + isSnowing);
    }
}
