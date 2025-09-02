public class FactorialRecursion {
    public static int calFact(int n){
        if(n==0||n==1){
            return 1;
        }
        int factnm1=calFact(n-1);
        int fact=n*factnm1;
        return fact;
    }
    public static void main(String[] args){
        int n=5;
        int ans=calFact(n);
        System.out.println(ans);
    }
}
