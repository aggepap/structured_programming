package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Converts fahrenheit degrees to Celsius
 */

public class _15FahrenheitToCelsius {
    public static void main(String[] args) {

        for( int i = -100; i<=100; i+=10){
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, convertFarh2Celc(i));
        }
    }

    /**
     *  Converts Fahrenheit degrees to Celsius.
     * @param fahrDeg  degrees in Fahrenheit
     * @return         degrees in Celcius
     */
    public static double convertFarh2Celc(double fahrDeg){
        return (fahrDeg - 32) * 5/9;
}
}
