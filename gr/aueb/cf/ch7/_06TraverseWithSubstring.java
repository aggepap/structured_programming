package gr.aueb.cf.ch7;

/**
 * Traverses an string with substring
 */
public class _06TraverseWithSubstring {
    public static void main(String[] args) {
        String s = "Athens";

        for (int i = 0; i<s.length(); i++){
            System.out.print(s.substring(i, i+1));
        }
    }
}
