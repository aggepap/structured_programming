package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει ένα μενού επιλογών, και ανάλογα με την επιλογή του χρήστη
 * δίνει feedback
 */

public class MenuSwitchApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Επιλέξτε ένα απο τα παρακάτω (0 για έξοδο)");
            System.out.println("1. One-player Game");
            System.out.println("2. Two-players Game");
            System.out.println("3. Team Game");

            choice= input.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Start One-player game");
                    break;
                case 2:
                    System.out.println("Start two-players game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;

            }
        }while (choice !=0);
    }
}
