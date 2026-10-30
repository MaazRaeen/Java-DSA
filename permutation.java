import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n; i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        perm(nums, ans, res);
        System.out.println(res);
    }
    static void perm(int nums[], List<Integer> ans,  List<List<Integer>> res){
        if(ans.size() == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i =0;i<nums.length; i++){
            if(ans.contains(nums[i])) continue;
            ans.add(nums[i]);
            perm(nums, ans, res);
            ans.remove(ans.size()-1);
        }
    }
}
