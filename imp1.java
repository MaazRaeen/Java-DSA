// given an array of n integer, find the third largest element .all the element in the array are distinct integer .
// example:
// input :Arr[]={1,14,2,16,10,20}
// output: the third largest element is 14

// import java.util.*;
// public class imp1 {
//        public static void main(String[] args) { 
//         // int[] Arr = {1, 14, 2, 16, 10, 20};
//         Arrays.sort(Arr);
//         int thirdlargest=Arr[Arr.length-3]
//         System.out.println(thirdlargest);

//     }
// }


// User input

import java.util.*;
public class imp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of  array: ");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        Arrays.sort(Arr);
        if (n < 3) {
            System.out.println("can't find.");
        } else {
            int thirdLargest = Arr[n - 3];
            System.out.println("third largest element :" +thirdLargest);
        }

    }
}


