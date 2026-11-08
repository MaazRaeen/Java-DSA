import java.util.*;
public class flightCost {
    static int minCost(int nums[], int idx, int[] dp){
        int n = nums.length;
        if(idx == nums.length-1){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        if(idx+1<n){
            ans1 = Math.abs(nums[idx] - nums[idx+1]) + minCost(nums, idx+1, dp);  
            
        }
        if(idx+3<n){
                ans2 = Math.abs(nums[idx] - nums[idx+3]) + minCost(nums, idx+3, dp);
            }
        
        
        return dp[idx] = Math.min(ans1, ans2);
        

    }
    public static void main(String[] args) {
        // return the min cost if flight - i can move only i+1 or i+3
        int nums[] ={1, 4, 5, 2};   
        int dp[] = new int[nums.length+1];
        java.util.Arrays.fill(dp, -1);
        System.out.println(minCost(nums, 0, dp));


        
    }
}
