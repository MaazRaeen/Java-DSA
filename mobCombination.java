public class mobCombination {
    public static  String[] keypad={".", "abc", "def", "ghi","jkl","mno","pqrs", "tu", "vwx","yz"};
    public static void printCombination(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currchar =str.charAt(idx);
        String map=keypad[currchar-'0'];
        for(int i=0;i<map.length();i++){
            printCombination(str, idx+1, combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="68";
        printCombination(str, 0, "");
    }
}
