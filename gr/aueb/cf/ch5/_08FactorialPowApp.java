package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με τη χρήση της μεθόδου facto
 * n! =  1*2*3*4..*n
 */
public class _08FactorialPowApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert n");
        n = input.nextInt();
        int facto = facto(n);
        System.out.println(facto);
       int pow= pow(2,10);
        System.out.println(pow);


    }

    /**
     * Iterative version of n!
     * @param n  the input of the user
     * @return n! (factorial)  of the n that user enters
     */
    public static int facto(int n){
        int result = 1;
        for (int i =1 ; i<=n ; i++){
            result*=i;
        }
        return result;
    }

    /**
     * Power a^b
     * @param a the base
     * @param b the power
     * @return the power of a^b
     */
    public static int pow(int a, int b){
        int res = 1;
  for(int i =1 ; i<=b; i++){
      res *= a;
  }
  return res;
    }
}
