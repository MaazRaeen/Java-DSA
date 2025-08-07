import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate factorial
        long factorial = 1; // Using long to handle larger factorials
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is " + factorial);

        // Closing the scanner
        sc.close();
    }
}
