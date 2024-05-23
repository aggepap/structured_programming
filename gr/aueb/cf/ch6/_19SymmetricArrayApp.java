package gr.aueb.cf.ch6;

/**
 * Demo of symmetric array
 */
public class _19SymmetricArrayApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int[] arr2 = {1,2,3,3,1};

        System.out.println( isSymetric(arr));
        System.out.println( isSymetric(arr2));
    }

    /**
     *  Checks if an array is symmetric, that means it's read the same
     *  RTL and LTR
     * @param arr  Name of the checked array
     * @return     true if array is symmetrical. False otherwise.
     */
    public static boolean isSymetric(int[] arr){
        boolean symmetric = true;

        for (int i = 0, j = arr.length - 1; i<j ; i++,j--){
            if(arr[i] != arr[j]){
                symmetric= false;

                break;
            }
        }
        return symmetric;
    }
}
