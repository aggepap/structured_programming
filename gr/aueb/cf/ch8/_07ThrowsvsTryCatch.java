package gr.aueb.cf.ch8;

import java.io.IOException;

public class _07ThrowsvsTryCatch {
    public static void main(String[] args) throws IOException {

        try{
            char ch = (char) System.in.read();
        }catch (IOException e){
            System.out.println("IO exception");
        }

    }
}
