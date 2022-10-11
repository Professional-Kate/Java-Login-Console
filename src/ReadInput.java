import java.util.Scanner;

public class ReadInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readInput() {
        while (true) {
            String stringUserInput = SCANNER.nextLine().trim();

            try {
                // try to convert the String the user inputted into an int
                return Integer.parseInt(stringUserInput);
            } catch (NumberFormatException error) {
                System.out.println("Please enter either 1 or 2");
            }
        }
    }
}