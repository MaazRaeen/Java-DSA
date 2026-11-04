import java.util.*;
public class largestDigit {

    public static void main(String[] args) {
        int num = 574893;
        int ans = 0;
        while(num>0){
            int dig = num%10;
            ans = Math.max(ans, dig);
            num/=10;

        }
        System.out.println(ans);
        
    }
}
   