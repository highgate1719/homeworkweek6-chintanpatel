package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction,
 * multiplication  and division methods
 * all with parameters and use string concatenation  methods.
 */
public class Program_05 {
    // instance method
    public void addition(int a, int b) {
        int answer = a + b;
        System.out.println("Addition : " + answer); // concatenation
    }

    // instance method
    public void subtraction(int a, int b) {
        int answer = a - b;
        System.out.println("Subtraction : " + answer); // concatenation

    }

    //static method
    public static void division(double a, double b) {
        double answer = a / b;
        System.out.println("Division :" + answer);
    }

    public static void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("Multiplication : " + answer);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program_05 obj = new Program_05();
        System.out.println("Enter number 1 :");
        int a = scanner.nextInt();
        System.out.println("Enter number 2 :");
        int b = scanner.nextInt();
        obj.addition(a, b); // calling instance method into main method
        obj.subtraction(a, b);// calling instance method into main method
        division(a, b); // calling static method into main method
        multiplication(a, b); // calling static method into main method
        scanner.close();
    }
}
