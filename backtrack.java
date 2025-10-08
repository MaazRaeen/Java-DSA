public class backtrack {
    public static void print(String str, int idx, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            print(newstr, idx+1, currChar+perm);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        print(str, 0, "");
    }
}
