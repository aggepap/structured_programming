package gr.aueb.cf.ch4;

/**
 * Αεναη FOR και break
 */

public class InternalFor {
    public static void main(String[] args) {
        int counter = 0;

        for(;;){
            System.out.print("forever ");
            counter++;
            if(counter %20 ==0){
                System.out.println();
            }

            if (counter == 100){
                break;
            }
        }
    }
}

