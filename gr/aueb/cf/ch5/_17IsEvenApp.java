package gr.aueb.cf.ch5;

public class _17IsEvenApp {
    public static void main(String[] args) {
       int num =20;
       boolean isEven = false;
       isEven = isEven(num);

        System.out.printf("%d is even : %b\n", num, isEven);
        System.out.printf("%d is%seven", num, isEven? " ": " not ");
    }

    public static boolean isEven(int num){
        return num % 2 == 0;

    }
}
