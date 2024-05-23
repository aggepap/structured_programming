package gr.aueb.cf.ch7;

/**
 * Demo of charAt();
 */
public class _04TraverseStrApp {
    public static void main(String[] args) {
       String s = "Athens University of economics and Business";

        for (int i = 0 ; i< s.length(); i++){
            System.out.print(s.charAt(i)+ " ");
        }
    }
}
