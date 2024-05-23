package gr.aueb.cf.ch6;

/**
 * Finds the minimum number of an array
 */

public class _03MinFromArray {
    public static void main(String[] args) {
        int[] arr2 = {2,5,2,1,5,6,2,7,8,24,5,0};
      int minPosition;
      minPosition = findMin(arr2);

            System.out.printf("min Value %d Min position %d", arr2[minPosition], minPosition + 1);

    }

    /**
     * Returns the position of the min element
     * @param arr
     * @return
     */
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min =arr[i];
                minPosition = i;
            }

        }
        return minPosition;
    }
}
