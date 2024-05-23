package gr.aueb.cf.ch6;

public class _12ReducingApp {
    public static void main(String[] args) {
    int[] arr2 = {2,5,6,2,4,2,15,2,52,2};
        System.out.println(getSum(arr2));
        System.out.println(getAvg(arr2));
    }
    public static int getSum(int[] arr){
        if(arr == null || arr.length == 0) return -1;

        int sum = 0;
        for (int item : arr){
            sum+=item;

        }
        return sum;
    }

    public static double getAvg(int[] arr){
        if(arr == null || arr.length == 0) return -1;

        int sum = 0;
        for (double item : arr){
            sum+=item;

        }
        return (double) sum/ arr.length;
    }
}
