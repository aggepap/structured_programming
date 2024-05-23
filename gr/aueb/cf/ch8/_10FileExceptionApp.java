package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _10FileExceptionApp{
    public static void main(String[] args) {
int num = 0;
try {
    num = getNum();
    System.out.println("num " + num);
}catch(FileNotFoundException | InputMismatchException e){
    e.printStackTrace();
    System.out.println("Error has occured. Please try again");
        } }

    public static int getNum() throws FileNotFoundException {
        File fd = new File("C:/temp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)) {
            num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}