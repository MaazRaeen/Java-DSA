import java.util.*;
public class HashMapIteration {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        //insertion operation
        map.put("INDIA", 120);
        map.put("America", 35);
        map.put("china", 120);
        map.put("Pakistan", 29);
        map.put("Canada", 5);
        map.put("South Korea", 5);
        // int arr [] = {12, 13, 14, 3};
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
        }
        System.out.println();
        Set<String> keys = map.keySet();
        for(String key :keys){
            System.out.println(key + " " + map.get(key));
        }

        //remove

        map.remove("china");
        System.out.println(map);
    }
}
