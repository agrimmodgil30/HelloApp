public class HelloApp {

    public static void main(String[] args) {

        String names;

        // Check if arguments were provided
        if (args.length > 0) {
            // Join all names with comma and space
            names = String.join(", ", args);
        } else {
            // Default value
            names = "World";
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}