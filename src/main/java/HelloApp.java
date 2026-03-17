public class HelloApp {

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {

            boolean first = true;

            // Enhanced for loop to iterate through arguments
            for (String name : args) {

                if (!first) {
                    names.append(", ");
                }

                names.append(name);
                first = false;
            }
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}