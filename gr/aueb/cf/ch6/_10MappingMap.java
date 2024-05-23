package gr.aueb.cf.ch6;

public class _10MappingMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] mappedArray = mapDouble(arr);
        traverseArray(mappedArray);
    }

    /**
     * Doubles the value of each item
     * of an array
     *
     * @param arr the input array
     * @return      a new array with elements equal to double
     * the initial value of th array elements
     */
    public static int[] mapDouble(int[] arr){
        int[] arrayToReturn = new int[arr.length];
    for(int i = 0; i<arr.length; i++){
        arrayToReturn[i] =arr[i]* 2;
    }
    return arrayToReturn;
    }
    public static void traverseArray(int[]arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
