import java.util.*;
public class printsubsets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n; i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        subset(nums, ans, 0, res);
        System.out.println(res);



    }
    static void subset(int nums[], List<Integer> ans,int idx, List<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        subset(nums, ans, idx+1, res);
        ans.remove(ans.size()-1);
        subset(nums, ans, idx+1, res);

    }
}
