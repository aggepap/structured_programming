package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _08MultipleExceptionsApp {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/temp/file.txt");
        try(Scanner in = new Scanner(file)){
            char ch = (char) System.in.read();
            int num = in.nextInt();
        }catch (FileNotFoundException | InputMismatchException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("IO exception");
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//        }

    }
}}
