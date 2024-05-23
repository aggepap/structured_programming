package gr.aueb.cf.ch7;

/**
 * Demo of equal string
 */
public class _08StrEqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s4 = "ATHENS";
    boolean equal = s1.equals(s2);
        boolean equal2 = s1.equalsIgnoreCase(s4);
        System.out.println(equal);
        System.out.println(equal2);
    }
}
