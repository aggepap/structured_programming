package gr.aueb.cf.ch6;

import java.util.Arrays;

public class _16ArraysUtilApp {
    public static void main(String[] args) {
        int[]arr = {5,4,9,3,12,1};
        int[] arrayCopy;
        int[] arrSecondCopy;

        Arrays.sort(arr);
        traverse(arr);
        System.out.println("");
        arrayCopy = Arrays.copyOf(arr, arr.length );
        traverse(arrayCopy);
        System.out.println("");
        arrSecondCopy = Arrays.copyOfRange(arr, 1, arr.length);
        traverse(arrSecondCopy);
    }

    public static void traverse(int[] arr){
        for (int item:arr){
            System.out.print(item + " ");
        }
    }
}
