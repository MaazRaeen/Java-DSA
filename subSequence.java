public class subSequence {
    public static void strSubSequence(String str, int idx, String newString){
        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currch=str.charAt(idx);
        strSubSequence(str, idx+1, newString+currch);
        strSubSequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        strSubSequence(str, 0, "");
    }
}
