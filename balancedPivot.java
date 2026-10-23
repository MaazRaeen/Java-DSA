import java.util.*;
public class balancedPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n; i++){
            nums[i] = sc.nextInt();
        }
        /* 
        input -> 5 
        nums = [2, 3, 4, 1, 4];
        & 
        input -> 3
        nums = [1, 2, 3];
        */
        int leftSum = 0;
        // int rightsum = 0;
        int totalSum = 0;
        for(int x: nums){
            totalSum += x;
        }
        for(int i =0;i<n; i++){
            int rightsum = totalSum - leftSum - nums[i];
            // totalSum-= nums[i];
            if(leftSum == rightsum){
                System.out.println(i);
                return;
            }
            leftSum+=nums[i];
        }
       System.out.println(-1);
    }

}
