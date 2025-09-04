public class xPWnwithstklogn {
    public static int calXpw(int x, int n){
        if(x==0) return 0;
        if(n==0) return 1;
        // int xpwnm1=calXpw(x, n-1);
        if(n%2==0){
            return calXpw(x, n/2)*calXpw(x, n/2);
        }
         else{
            return calXpw(x, n/2)*calXpw(x, n/2) *x;
        }

    }
    public static void main(String [] args){
        int x=2;
        int n=5;
        int ans= calXpw(x, n);
        System.out.println(ans);
    }    
}
