package gr.aueb.cf.ch2;

/**
 * Επιδεικνύει την χρήση αριθμητικών τελεστών
 * σε αριθμητικές παραστάσεις (expressions)
 *
 */

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 21;
        int num3 = 12;
        int num4 = 17;

        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1= 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

     result1 = (num1 + num2) * (num1 - num2) / (num1+7);
     result2 = sum++; //
        System.out.println(result2);
        System.out.printf("sum = %d, sub = %d, mul = %d, div=%d \n", sum, sub, mul, div);
        System.out.printf("result1 = %d, result2 = %d", result1, result2);

    }

}
