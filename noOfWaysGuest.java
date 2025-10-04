public class noOfWaysGuest {
    public static int noOfWays(int n){
        if(n<=1) return 1;
        int single=noOfWays(n-1);
        int pair=(n-1)*noOfWays(n-2);
        return single+pair;
    }
public static void main(String[] args) {
    int n=2;
    System.out.println(noOfWays(n));
}
}
