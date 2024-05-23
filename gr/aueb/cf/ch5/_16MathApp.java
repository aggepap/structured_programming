package gr.aueb.cf.ch5;

/**
 *  Demonstrates ceil, Floor,random
 */

public class _16MathApp {
    public static void main(String[] args) {
double d = 3.45;

        System.out.printf("%2f: ceil :%d, floor %d\n", d, getCeil(d), getFloor(d));
        System.out.println("Random value between 1-100: " + getRandom(1,100));
    }

    /**
     * Uses Math Class to round up the input number
     *
     * @param num   number to be rounded up
     * @return      rounded up number
     */
    public static int getCeil(double num){
     return (int) Math.ceil(num);
    }

    /**
     * Uses Math Class to floor the input number
     * @param num number to be floored
     * @return    Floored number
     */
    public static int getFloor(double num){
        return (int) Math.floor(num);
    }

    /**
     *  Returns an random in between min and max
     * @param min   Minimum value
     * @param max   Maximum value
     * @return      a random number between min and max
     */
    public static int getRandom(int min, int max){
return  (int) (Math.random() * (max - min + 1)) + min;
    }
}
