package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το γινόμενο του 1 x 2 x 3 x 4 .... x 10 με While loop
 */
public class Mul10App {
    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while(i<=10){
            mul *=i;
            System.out.println(mul);
            i++;
        }

    }
}
