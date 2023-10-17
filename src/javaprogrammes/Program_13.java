package javaprogrammes;

import java.util.Scanner;

public class Program_13 {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //new scanner created
        System.out.println("Enter First Number :  ");
        /**
         * using double as data type , we can enter any data type number
         * used double as the return type of the avr method
         */
        double num1 = scan.nextDouble();
        System.out.println("Enter Second Number :  ");
        double num2 = scan.nextDouble();
        System.out.println("Enter Third Number :  ");
        double num3 = scan.nextDouble();
        System.out.println("The average of entered numbers is : " + avr(num1, num2, num3));
        scan.close();
    }

    public static double avr(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
