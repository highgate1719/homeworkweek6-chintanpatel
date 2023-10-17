package javaprogrammes;

public class Program_01 {
    /**
     * 1 Declare two instance variables.
     * 2 Declare one instance method.
     * 3 Call both instance variables into the instance method inside the print statement.
     * 4 Declare the Main method.
     * 5 Call the above instance method into the Main method and Run the programme.
     */
    int a = 10; // declare two instance variable
    int b = 20;

    //Declare one instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //call the above instance method into the main method
        Program_01 obj = new Program_01();
        obj.myMethod();
    }
}

