public class HelloApp {

    public static void main(String[] args) {

        // Assign name using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}