package javaprogrammes;
import java.util.Scanner;
public class Program_06 {
    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r).
     * program to calculate radius of the circle,
     * specified radius value in program
     */
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in); //new scanner created

        System.out.println(" Enter the radius value of the circle");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius * radius; // calculation for radius

        System.out.println("Area of the Circle is " + area);
        input.close();//scanner closed
    }
}
