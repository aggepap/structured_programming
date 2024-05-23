package gr.aueb.cf.ch6;

import java.util.Arrays;

public class _08SelectionSort {
    public static void main(String[] args) {
int[] arr = {2,5,15,12,6,7,3,19,22,1,44,8};
//        selectionSort(arr);
        Arrays.sort(arr);
        traverseArray(arr);

    }


    /**
     * Sorting an array based on selection sort
     * time complexity O(n^2)
     * @param arr
     */
    public static void selectionSort(int[]arr){
        if (arr == null) return;
    int min;
    int minPosition;
        for (int i = 0 ; i < arr.length - 1; i++){
           minPosition = i;
           min = arr[i];

            for(int j = i + 1; j < arr.length; j++){
                if( arr[j] < min){
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i , minPosition);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j]=tmp;
    }
    public static void traverseArray(int[]arr){
        for (int el: arr){
            System.out.println(el + " ");
        }
    }
}

