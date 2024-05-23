package gr.aueb.cf.ch3;


import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int totalGrades = 0;
        int gradesCount = 0;
        int avg = 0;

        System.out.println("Please Insert total grades and grades count");
        totalGrades = scanner.nextInt();
        gradesCount = scanner.nextInt();

        if(gradesCount == 0){
            System.out.println("Grades count cannot be 0");
            System.exit(1);
        }
        avg = totalGrades/gradesCount;

        if (avg<0 || avg > 10){
            System.out.println("Error. The average is not valid");
            System.exit(1);
        }

        if (avg>9){
            System.out.println("Excellent");
        } else if(avg >= 7){
            System.out.println("Very Good");
        } else if (avg >= 5) {
            System.out.println("Good");
        }else{
            System.out.println("Failed");
        }
    }
}
