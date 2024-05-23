package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _11FileException2App {
    public static void main(String[] args) {
        int num = 0;
        try{
            num = getNum();
            System.out.println("Num "+ num);
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
        }catch (InputMismatchException e){
            System.out.println("Error Reading");

        }catch (ArithmeticException e){
            System.out.println("Need to be a positive number");
        }
    }
    public static int getNum() throws FileNotFoundException, InputMismatchException, ArithmeticException{
        int num = 0;
        File fd = new File("C:/temp/file.txt");

        try(Scanner input = new Scanner(fd)){
            if(!input.hasNextInt()){
            throw new InputMismatchException();
        }
            num = input.nextInt();

            if(num < 0 ){
                throw new ArithmeticException("Cannot be negative");
            }
        }catch (FileNotFoundException | InputMismatchException | ArithmeticException e){
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}
