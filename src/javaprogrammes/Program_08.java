package javaprogrammes;

import java.util.Scanner;

public class Program_08 {

    public static void main(String[] args) {
/**
 * Write a program to calculate the area of a triangle.
 * two variable created base and height
 */
        int base = 0;
        int height = 0;

        int area = 0;

        Scanner scanner = new Scanner(System.in); //new scanner created
        System.out.println("Enter the length of base of Triangle:  ");
        base = scanner.nextInt();

        System.out.println("Enter the length of height of Triangle :  ");
        height = scanner.nextInt();

        area = (base * height) / 2; // triangle calculation

        System.out.println("The area of Triangle is :" + area);
        scanner.close();
    }
}
