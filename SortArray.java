import java.util.Scanner;
import java.util.Arrays; 

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] descendingNumbers = Arrays.copyOf(numbers, size);

        Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

        for (int i = 0; i < size / 2; i++) {
            int temp = descendingNumbers[i];
            descendingNumbers[i] = descendingNumbers[size - i - 1];
            descendingNumbers[size - i - 1] = temp;
        }

        System.out.println("Sorted array in descending order: " + Arrays.toString(descendingNumbers));

        
        scanner.close();
    }
}
