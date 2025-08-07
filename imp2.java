// ratate the array 
// input :arr[]={1,2,3,4,5,6},d=2
// Output:{3,4,5,6,1,2}
// Explanation : after irst left rotation,arr[]becomes{2,3,4,5,6,1} and after the second 
// input : arr[]={1,2,3},d=4
// Output {2,3,1}
import java.util.*;

public class imp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of left rotations: ");
        int d = sc.nextInt();
        d = d % n;
        rotateArray(arr, d, n);
        System.out.println("The rotated array is: " + Arrays.toString(arr));
        sc.close();
    }
    public static void rotateArray(int[] arr, int d, int n) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
        public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

