package gr.aueb.cf.ch6;

/**
 * travers an array and prints it's values;
 */
public class _02TraverseArray {
    public static void main(String[] args) {
        int[] ages = {20,25,22,40};

        //Απλή for
        for (int i=0 ; i < ages.length; i++){
//            System.out.println(ages[i]);
        }

        //For each
        for (int age: ages){
            System.out.println(age + " ");
        }
    }
}
