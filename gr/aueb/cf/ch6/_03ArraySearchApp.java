package gr.aueb.cf.ch6;

/**
 * Searches for an element in an array
 */

public class _03ArraySearchApp {
    public static void main(String[] args) {
final int SECRET = 9;
//boolean isFound = false;
int position = -1;
int[] arr = {1,2,3,4,5,6,7,9};
        for (int i = 0 ; i < arr.length; i++ ){
            if (arr[i] == SECRET){
//            isFound=true;
                position = i;
            break;
            }
        }
        System.out.println("Position "+ position);
//        if (isFound){
//            System.out.println("Found: "+ SECRET);
//        }else{
//            System.out.println("Not found");
//        }
    }

}

