import java.util.*;
public class SecondMostFreq {
    public static void main(String[] args) {
        String str = "aabababa";
        HashMap<Character, Integer> map =new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
    }
}
