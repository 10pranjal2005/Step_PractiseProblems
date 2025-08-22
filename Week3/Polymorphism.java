public class Polymorphism {

    // Method with one parameter
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method with different parameter type
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method with two parameters
    void display(int a, int b) {
        System.out.println("Integer: " +a);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        
        obj.display(10);         // Calls method with int
        obj.display("Hello");    // Calls method with String
        obj.display(5, 7);       // Calls method with two ints
    }
}
