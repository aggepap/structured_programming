package gr.aueb.cf.ch6;

public class _09FilteringApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] evenArr = filterEven(arr);
        traverseArray(evenArr);

    }

    public static int[] filterEven (int[] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int count = 0;

        for (int item :arr){
            if (item %2 == 0){
                count++;
            }
        }
        int[] returnedArr = new int[count];
        count= 0;
        for (int item :arr){
            if (item % 2 ==0){
    returnedArr[count] = item;
count++;
}
        }
        return returnedArr;
    }
    public static void traverseArray(int[]arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
