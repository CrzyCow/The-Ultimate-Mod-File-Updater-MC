import java.util.Scanner;

public class VersionUpdater {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a value for 'a'
        System.out.print("Enter a minecraft java version: ");

        // Reading the user input and storing it in the variable 'a'
        String mcVersion = scanner.next();

        // Closing the scanner to prevent resource leak
        scanner.close();

        // Instantiating the Testing class to use its member variable
        Testing test = new Testing(mcVersion);

        // Using the member variable 'a' for comparison
        if (test.mcVersion.equals("1.19.4")) {
            System.out.println("Valid version");
        } else {
            System.out.println("Invalid version");
        }
    }
}

class Testing {
    String mcVersion; // Member variable declaration

    // Constructor to initialize 'a'
    public Testing(String mcVersion) {
        this.mcVersion = mcVersion;
    }
}
