package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Η εφαρμογή παράγει ένα τυχαίο νούμερο, το οποίο προσπαθεί ο χρήστης να μαντέψει,
 * δίνοντας πιθανές απαντήσεις μέσω του console
 */

public class BingoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SECRET =12;
        int num = 0;
        boolean isFinished = false;
        do {
            System.out.println("please insert a num and guess the secret");
            num = scanner.nextInt();

            if(num == SECRET){
                System.out.println("Bingo!!");
                isFinished = true;
            }else{
                System.out.println("Wrong, Try again");

            }
        } while(!isFinished);


    }
}
