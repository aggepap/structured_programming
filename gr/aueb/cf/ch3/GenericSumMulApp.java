package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη τον αριθμό των επαναλήψεων,
 * και προσθέτει/πολλαπλασιάζει τους αριθμούς αυτούς κατα σειρά
 * (1+2+....+n) και το (1*2*3.....*n)
 */
public class GenericSumMulApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;
        int n =0;
        int sum = 0;
        int mul = 1;

        System.out.println("Please insert n");
        n= in.nextInt();

        while (i <=n ){
            sum +=i;
            mul *=i;
            System.out.printf("Sum = %d , Mul = %d", sum, mul);
            i++;


        }
    }
}
