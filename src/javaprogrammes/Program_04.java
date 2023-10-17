package javaprogrammes;

/**
 * 1 Declare two instance and two static variables.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program_04 {
    int a = 10; // first instance variable
    int b = 20; // second instance variable
    static int c = 30; //static variable
    static int d = 40; // static variable

    public void myMethod() { // instance method
        System.out.println(a);
        System.out.println(b);
        Program_04 obj = new Program_04();
        System.out.println(Program_04.c);
        System.out.println(Program_04.d);

    }

    public static void myMethod1() { // static method
        Program_04 m1 = new Program_04();
        System.out.println(m1.a);
        System.out.println(m1.b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void main(String[] args) {
        // main method calling both static and instance method into main method
        myMethod1();
        Program_04 m2 = new Program_04();
    }
}
