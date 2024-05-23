package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods
 */

public class _11PredicatesApp {
    public static void main(String[] args) {
int[] arr = {-1, -2,-10,-23,-33};
hasOnePositive(arr);
        System.out.println(hasOnePositive(arr));
    }
    public static boolean hasOnePositive (int[] arr){
        boolean hasPositive = false;

        for (int item : arr){
            if(item > 0){
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }
    public static void traverseArray(int[]arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

    public static boolean areAllPositive(int[] arr){
        int count = 0;

        for (int item : arr){
            if (item > 0){
                count++;

            }
        }
        return count == arr.length;
    }

    public static boolean areGTEven(int[] arr, int threshold){
        int count = 0;
        for(int item : arr){
            if(item % 2 == 0){
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold){
        int count = 0;
        for(int item : arr){
            if(item % 2 != 0){
                count++;
            }
        }
        return count >= threshold;
    }
    public static boolean areSameEnding(int[] arr, int threshold){
        int[] endings = new int[10];
        boolean sameEnding = false;

        for(int item:arr){
            endings[item % 10]++;
        }
        for(int item:endings){
            if (item >= threshold){
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }
    public static boolean areSameGroupOfTens(int[] arr, int threshold){
        int[] tens = new int[10];
        boolean sameTen = false;

        for(int item:arr){
            tens[item / 10]++;
        }
        for(int item:tens){
            if (item >= threshold){
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
