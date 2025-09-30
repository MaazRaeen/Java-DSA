public class rmvDuplicates {
    public static boolean[]map=new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currch=str.charAt(idx);
        if(map[currch -'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString+=currch;
            map[currch-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args){
        String str="maazraeen";
        removeDuplicates(str, 0, "");
    }
}
