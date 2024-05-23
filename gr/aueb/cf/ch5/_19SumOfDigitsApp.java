package gr.aueb.cf.ch5;

/**
 * Calculates the sum of the digits in an int
 *  For example the sum of digits of 571 = 5+7+1=13
 */

public class _19SumOfDigitsApp {
    public static void main(String[] args) {
int inputNum = 999999;

        System.out.printf("Sum of %d = %d",inputNum, getSumOfDigits(inputNum) );
    }
    public static int getSumOfDigits(int num){
        int left = num;
        int rightDigit =0;
        int sum = 0;
        do{
rightDigit = left % 10;
left = left/10;
sum +=rightDigit;

        } while (left !=0);
      return sum;
    }
}
