package gr.aueb.cf.ch6;

/**
 * Returns min position of an array
 */

public class _04MinFromArray {
    public static void main(String[] args) {

    }
    public static int getMinPosition(int[] arr){
        if(arr == null) return -1;

        int min = arr[0];
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
       if (arr[i] < min){
           min = arr[i];
           minPosition= i;
       }
        }    return minPosition;
    }

}
