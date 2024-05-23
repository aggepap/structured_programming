package gr.aueb.cf.ch4;

/**
 * Demo of surrogate pairs
 */

public class UnicodeApp {
    public static void main(String[] args) {
        int smiley = 0x1F600; //UTF 8 Smiley με 0x γραφουμε δεκαεξαδικούς
        System.out.print("Smiley : \uD83D\uDE00");
        System.out.println(Character.toChars(smiley));
    }
}
