package javaprogrammes;

import java.util.Scanner;

public class Program_07 {
    /**
     * Write a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     * New scanner inserted and primitive data type double used to
     * run this program
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); //new scanner created
        System.out.println("Insert any temperature value in degree Fahrenheit: ");
        double fahrenheit = obj.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " Degree Fahrenheit is equal to  " + celsius + "in Celsius");
        obj.close();// scanner closed
    }
}


