import java.util.*;
import java.util.HashMap;
public class HashMapQ {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        //insertion operation
        map.put("INDIA", 120);
        map.put("America", 35);
        map.put("china", 120);
        map.put("Pakistan", 29);
        map.put("Canada", 5);
        map.put("South Korea", 5);
        System.out.println(map);
        //search 
        if(map.containsKey("china")){
            System.out.println("yes present");
        }else{
            System.out.println("Faaah❌");
        }
        System.out.println((map.get("china")));   //-->key exist;
        System.out.println((map.get("Indonasia"))); //-->key don't exist;
        
    }
}
