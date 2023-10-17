package javaprogrammes;

public class Program_14 {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     *using printf statement with formatted output to display the results
     * Searched on browser for help to create this program
     */
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        double perimeter = 2*(width + height);
        double area = height * width;

        System.out.printf("Perimeter is 2 *(%.1f + %.1f) = %.2f \n" , height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n" , height, width, area);
    }
    }

