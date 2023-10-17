package javaprogrammes;

public class Program_15 {
    public static void main(String[] args) {
        /**
         * Write a Java program to swap two variables.
         * Assigned two static temp variables a and b to value
         */
        int a, b;
        a = 35;
        b = 45;
        System.out.println("Before Swapping : a , b = " + a + " , " + +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping : a , b = " + a + " , " + +b);
    }
}