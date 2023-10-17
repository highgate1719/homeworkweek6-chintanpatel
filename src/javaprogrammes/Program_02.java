package javaprogrammes;


/**
 * Write a Java programme using the following steps.
 * 1 Declare two static variables
 * 2 Declare one static method
 * 3 Call both static variables into the static method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the static method into the Main method and Run the programme.
 */

public class Program_02 {
    // declare two static variables
    static int a = 10;
    static String name = "Print Test";

    // Declare one static method
    // call both static variables into the static method inside print statement
    public static void myMethod() {

        System.out.println(a);
        System.out.println(name);
    }

    //declare the main method
    // call the static method into The main method
    public static void main(String[] args) {
        myMethod();
    }


}
