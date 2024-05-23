package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών, με do/While. Η do/while
 * εκτελείτε οπωσδήποτε ΤΟΥΛΑΧΙΣΤΟΝ μία φορά.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Επιλέξτε μια απο τις παρακάτω CRUD επιλογές (0 για έξοδο)");
            System.out.println("1. Εισαγωγή (insert) προϊόντος");
            System.out.println("2. Ενημέρωση (update) προϊόντος");
            System.out.println("3. Διαγραφή (delete) προϊόντος");
            System.out.println("4. Αναζήτηση (Select) προϊόντος");
            choise = in.nextInt();
        }while(choise != 0);

        System.out.println("Ευχαριστούμε");
    }
}
