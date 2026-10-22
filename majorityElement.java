import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int ans =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>=n/2){
                ans = entry.getKey();
            }
        }
        System.out.print(ans);
    }
}
