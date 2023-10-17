package javaprogrammes;

/**
 * Write a Java programme using the following steps.
 * 1 Declare one instance and one static variable.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program_03 {
    int a = 10; // declare of one instance and one static variable
    static int b = 20;

    //Declare one instance method.
    //call instance variables into instance method
    public void myMethod() {
        System.out.println(a);
        Program_03 obj = new Program_03();
        System.out.println(Program_03.b);
    }

    // declare one static method
    public static void myMethod1() {
        Program_03 m1 = new Program_03();
        System.out.println(m1.a);
        System.out.println(b);
    }

    // Declare the main method
    // call both instance and static methods into the main method
    public static void main(String[] args) {
        myMethod1();
        Program_03 c1 = new Program_03();
        c1.myMethod();
    }
}
