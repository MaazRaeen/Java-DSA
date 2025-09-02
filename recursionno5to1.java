public class recursionno5to1 {
    public static void printArray(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printArray(n-1);
    }
    public static void main(String[] args){
        int n=5;
        printArray(n);
    }
}
