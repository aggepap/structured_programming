package gr.aueb.cf.ch7;

/**
 * Demo Of indexOf() and substring().
 */
public class _05IndexOfSubstringApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int positionOfNextO = s.indexOf("o", 2);
        System.out.println(positionOfo);
        System.out.println(positionOfNextO);

        String odToEnd = s.substring(1);
        String odToEnd2 = s.substring(3,s.length()-4);
        System.out.println(odToEnd);
        System.out.println(odToEnd2);
    }
}
