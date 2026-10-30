import java.util.*;
public class AllSubsequencesofString {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = "abc";
        ArrayList<String> ans = new ArrayList<>();
        subSequence(s, "", ans, 0);
        Collections.sort(ans);
        System.out.println(ans);

        

    }
    static void subSequence(String s, String curr, List<String> ans, int idx){
        if(idx == s.length()){
            ans.add(curr);
            return;
        }
        subSequence(s, curr+s.charAt(idx), ans, idx+1); //include
        subSequence(s, curr, ans, idx+1); //exclude
    }
}