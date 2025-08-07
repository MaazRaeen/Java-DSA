import java.util.*;
public class primeno {
    public static void primenocheck(int n){
        if (n<=1){
            System.out.println("not prime");
            return;
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("is prime");
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        primenocheck(n);
    }
}
