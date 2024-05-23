package gr.aueb.cf.ch3;

/**
 * υπολογίζει το άθροισμα των αριθμών 1+2+3+4...+10 με while loop
 */
public class Sum10App {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(i<=10){
            sum +=i;
            System.out.println(sum);
            i++;
        }

    }
}
