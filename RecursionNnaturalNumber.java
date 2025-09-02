public class RecursionNnaturalNumber {
    public static void printSum(int n, int i, int sum){
        if(i==n) {
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        // System.out.println(sum);
        printSum(n, i+1, sum);
        
        // return;
        // System.out.println(i);
    }
    public static void main(String[] args){
        int n=5 ;
        int sum=0;
        int i=1;
        printSum(n, i, sum);
        // or -> printSum(5, 1, 0)
    }
}
