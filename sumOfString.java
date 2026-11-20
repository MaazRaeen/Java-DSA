import java.util.*;
public class sumOfString {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String s[] = {"tea", "coffeez", "juice", "shape", "Maaz", "naay"};
        int[] val = new int[s.length];
        for(int i =0;i<s.length; i++){
            String str = s[i];
            int ans = 0;
            for(int j =0; j<str.length(); j++){
                ans += str.charAt(j)-'a';
            }
            val[i] = ans;
            map.put(s[i], val[i]);
        }
        String sorted[]= new String[val.length];
        java.util.Arrays.sort(val);
        for(int i = 0; i<val.length; i++){
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getValue()== val[i]){
                    sorted[i] = entry.getKey();
                }
            }
        }
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]+ " ");
        }
        System.out.println();
        
    }
}
