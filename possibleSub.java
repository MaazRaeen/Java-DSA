import java.util.*;
public class possibleSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        List<List<Integer>> allSub = new ArrayList<>();
        sub(nums, ans, allSub, 0);
        System.out.print(allSub);
    }
    static void sub(int nums[], ArrayList<Integer> ans, List<List<Integer>> allSub, int i){
        if(i==nums.length){
            allSub.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        sub(nums, ans, allSub, i+1);
        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx<nums.length && nums[idx] == nums[idx-1]){
            idx++;
        }
        sub(nums, ans, allSub, idx);
    }
}
