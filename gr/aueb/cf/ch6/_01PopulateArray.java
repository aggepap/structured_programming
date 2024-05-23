package gr.aueb.cf.ch6;

public class _01PopulateArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 60;
        arr[4] = 90;

        System.out.println(arr[3]);

        //Unsized initialization

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr2[5]);

        //array initializer
        int[] arr3 = new int[]{1,3,5,7,9,12};
        System.out.println(arr3[5]);
    }
}
