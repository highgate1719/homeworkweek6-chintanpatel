package javaprogrammes;


import java.util.Scanner;

public class Program_16 {
    /**Write a Java program to add two binary numbers.
     Input Data:
     Input first binary number: 10
     Input second binary number: 11
     Expected Output:
     Sum of two binary numbers: 101
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // new scanner created
        System.out.println("Insert the First Binary Number :  ");
        String binary = scanner.nextLine();
        System.out.println("Insert the Second Binary Number :  ");
        String binary1 = scanner.nextLine();
        scanner.close(); // scanner closed

        // adding two binary number

        int b1 = Integer.parseInt(binary,2);
        int b2 = Integer.parseInt(binary1, 2);
        int sum = b1 + b2 ;

        System.out.println("Addition of above binary is : ");
        System.out.println(Integer.toBinaryString(sum));
    }
}
