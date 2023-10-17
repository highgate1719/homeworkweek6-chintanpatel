package javaprogrammes;


import java.util.Scanner;
public class Program_18 {
    /**
     * Write a Java program to print the sum (addition), multiply, subtract, divide and
     * remainder of two numbers.
     * Took two integer numbers as input from the user using the Scanner class.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //new scanner created
        System.out.println("Input First Number :  ");
        int num1 = scanner.nextInt();

        System.out.println("Input Second Number:  ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + "=" +(num1 + num2));
        System.out.println(num1 + " - " + num2 + "=" +(num1 - num2));
        System.out.println(num1 + " * " + num2 + "=" +(num1 * num2));
        System.out.println(num1 + " / " + num2 + "=" +(num1 / num2));
        scanner.close();
    }
}
