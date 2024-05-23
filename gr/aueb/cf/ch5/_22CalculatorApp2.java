package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implements a calculator
 */

public class _22CalculatorApp2 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int choice;
        int errorCode;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true){
            printMenu();

            choice = getChoice();
//            if(choice == 'q' || choice == 'Q'){
//                System.out.println("Quiting....");
//                break;
//            }

            errorCode = validate(choice);

          if(errorCode == 1){
              System.out.println("Quiting...");
              break;
          }
          if(errorCode == 2){
              System.out.println("Error in choice");
              continue;
          }

          System.out.println("Please insert two integers");
          num1 = input.nextInt();
          num2 = input.nextInt();

          result = getResultFromChoice(choice, num1, num2);

          if (result == Integer.MIN_VALUE) {
              System.out.println("Divide by zero error");
              continue;
          }
          if (result == Integer.MAX_VALUE) {
              System.out.println("Invalid Choice, Try Again please");
              continue;
          }
            System.out.println("result: "+ result);
        }
    }

    /**
     *  Returns the result based on choice and the input. If the input leads to divide by zero error
     *  in div or mod, then the result is Integer.MIN_VALUE.
     *
     * @param choice       The choice (1-5) of the user. 1 for add 2, for sub 3,
     *                     for mul, 4 for div, 5 for mod. Any other choice leads to an
     *                     error state, and method returns Integer.MAX_VALUE as an error code.
     * @param num1         The first input number
     * @param num2         The second input number
     * @return             The result of the operation based on choice and
     *                     the two input numbers.
     */
    public static int getResultFromChoice( int choice, int num1, int num2){
        int result = 0;

        switch (choice){
            case 1: result = add(num1, num2); break;
            case 2: result = sub(num1, num2); break;
            case 3: result = mul(num1, num2);break;
            case 4: result = div(num1, num2);break;
            case 5: result = mod(num1, num2);break;
            default: result = Integer.MAX_VALUE;break;
        }
        return result;
    }
    // Αποθηκεύει την επιλογή του χρήστη
    public static int getChoice() throws IOException {
        return input.nextInt();
    }
    //Εμφανίζει το μενού
    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Module");
        System.out.println("6. Έξοδος");
    }

    public static int validate(int choice){
        int errorCode = 0;
//        int choiceInt = Character.getNumericValue((int) choice);

        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                errorCode = 0;
                break;
            case 6: errorCode =1;
            break;
            default: errorCode = 2;
            break;
        }
        return errorCode;
    }

    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static int sub (int num1, int num2){
        return num1 - num2;
    }
    public static int mul (int num1, int num2){
        return num1 * num2;
    }
    public static int div (int num1, int num2){
        return num2 == 0 ? Integer.MIN_VALUE : num1/num2;

    }
    public static int mod (int num1, int num2){
        return num2 == 0 ? Integer.MIN_VALUE : num1%num2;
    }
}
