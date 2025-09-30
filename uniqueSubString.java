import java.util.HashSet;

public class uniqueSubString {
    public static void unique(String str, int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currch=str.charAt(idx);
        unique(str, idx+1, newString+currch, set);
        unique(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        unique(str, 0, "", set);
    }
}
