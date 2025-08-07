import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];
        int sum = 0;

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];  // Calculate the sum of elements
        }

        // Calculate and print the average
        double average = (double) sum / n;
        System.out.println("The average of the elements is: " + average);

        // Close the scanner
        scanner.close();
    }
}
