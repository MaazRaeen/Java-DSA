// import java.util.*;
public class fruiteFreq {

    public static void main(String[] args) {
        
        String s = "aaabbbbcc";
        int cnt[] = new int[26];
        for(int i =0; i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
            
        }
        // for(int i = 0; i<cnt.length; i++){
        //     System.out.print(cnt[i] +", ");
        // }
        // System.out.println();
        int minEven = Integer.MAX_VALUE;
        int maxOdd = 0;
        for(int i =0; i<cnt.length;i++){
            if(cnt[i] == 0) continue;
            if(cnt[i]%2==0){
                minEven = Math.min(minEven, cnt[i]);
            }else{
                maxOdd = Math.max(maxOdd, cnt[i]);
            }
            
        }
        // System.out.println(maxOdd +"  "+ minEven);
        System.out.println(Math.abs(minEven - maxOdd));
    }
}
