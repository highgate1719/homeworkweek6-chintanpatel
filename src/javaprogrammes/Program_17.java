package javaprogrammes;

import java.util.Scanner;

public class Program_17 {
    /**
     * Write a Java program to convert a decimal number to binary number.
     * <p>
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     * Took help from java tutorial website
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //new scanner created
        System.out.println("Enter Decimal Number : ");
        int d = input.nextInt();
        System.out.println("Binary equivalent of " +d+ "  is :");
        System.out.println(Integer.toBinaryString(d));

        System.out.println("Enter Binary number : ");
        String b = input.next();
        System.out.println("Decimal equivalent of " +b+" is:");
        System.out.println(Integer.parseInt(b, 2));
        input.close();
    }
}
