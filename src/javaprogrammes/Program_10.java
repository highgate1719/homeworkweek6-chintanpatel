package javaprogrammes;

import java.util.Scanner;

public class Program_10 {
    /**
     * Java program that takes number as input and prints its
     * multiplication table up to 10
     * test data to insert a number :8
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //new scanner created
        System.out.println("Enter the Table number value : ");
        int b = sc.nextInt();
        int a1 = b;
        int a2 = b * 2;
        int a3 = b * 3;
        int a4 = b * 4;
        int a5 = b * 5;
        int a6 = b * 6;
        int a7 = b * 7;
        int a8 = b * 8;
        int a9 = b * 9;
        int a10 = b * 10;
        System.out.println(+b + " x 1 = " + a1);
        System.out.println(+b + " x 2 = " + a2);
        System.out.println(+b + " x 3 = " + a3);
        System.out.println(+b + " x 4 = " + a4);
        System.out.println(+b + " x 5 = " + a5);
        System.out.println(+b + " x 6 = " + a6);
        System.out.println(+b + " x 7 = " + a7);
        System.out.println(+b + " x 8 = " + a8);
        System.out.println(+b + " x 9 = " + a9);
        System.out.println(+b + " x 10 = " + a10);
        sc.close();
    }
}
