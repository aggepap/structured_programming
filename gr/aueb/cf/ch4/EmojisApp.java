package gr.aueb.cf.ch4;

/**
 * Prints the whole range of emojis.
 * range 1F600 - 1F64F (emojis range in UTF-8)
 */

public class EmojisApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int emoji = emojiStart;
        int counter = 0;


        while (emoji <= emojiEnd){
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if(counter % 16 ==0){
                System.out.println();
            }
        }
    }
}
