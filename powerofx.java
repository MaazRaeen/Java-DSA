public class powerofx {
    public static int calXpower(int n, int x){
        if(x==0) return 0;
        if(n==0)return 1;
        int xpowerNm1=calXpower(n-1,x);
        int xpower=x*xpowerNm1;
        // System.out.println(xpower);
        return xpower;
    }
    public static void main(String[] args){
        int n=5;
        int x=2;
        int ans=calXpower(n, x);
        System.out.println(ans);
    }
}