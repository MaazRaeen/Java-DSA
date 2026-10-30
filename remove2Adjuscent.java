import java.util.*;
public class remove2Adjuscent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // char[] ch = str.toCharArray(); 
        StringBuilder sb = new StringBuilder(str);
        for(int i =1; i<sb.length(); i++){

            if(sb.charAt(i) == sb.charAt(i-1)){
                sb.delete(i-1, i+1);
                i=0;
                // continue;
            }
            

        }
        System.out.println(sb.toString());
    }
}
