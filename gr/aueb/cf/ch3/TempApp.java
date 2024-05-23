package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει απο το Standard input έναν ακέραιο που συμβολίζει μια θερμοκρασία, και ελέγχει αν
 * η θερμοκρασία είναι μικρότερη απο 0. Στο τέλος εκτυπώνει το αποτέλεσμα
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert the temperature(interger)");
        temp = in.nextInt();

//        if (temp < 0){
//            isTempBelowZero = true;
//            System.out.println("The temperature is lower than Zero");
//        }else{
//            isTempBelowZero = false;
//            System.out.println("The temperature is higher than Zero");
//        }

        isTempBelowZero = temp < 0;
        System.out.println(isTempBelowZero);
    }
}

