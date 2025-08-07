
import java.util.Scanner;
 
public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        // String upperCaseString = userInput.toUpperCase();
        // String lowerCaseString = userInput.toLowerCase();
        int lengthOfString = userInput.length();

        // System.out.println("Original string: " + userInput);
        // System.out.println("Uppercase string: " + upperCaseString);
        // System.out.println("Lowercase string: " + lowerCaseString);
        System.out.println("Length of string: " + lengthOfString);

        scanner.close();
    }
}
