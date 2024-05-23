package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06TryWithResourcesApp {
    public static void main(String[] args) {
        int num = 0;
        try( Scanner in = new Scanner(System.in)){ //βαζοντας το resource στο try, και αν είναι autoclosable resource, η java το κλείνει αυτόματα και δημιουργεί το Finally αυτόματα.
            System.out.println("Insert a num");
        num = in.nextInt();
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
}
