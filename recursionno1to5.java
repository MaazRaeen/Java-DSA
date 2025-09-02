public class recursionno1to5 {
    public static void printArray(int n){
        if(n>5) return;
        System.out.println(n);
        printArray(n+1);
    }
    public static void main(String[] args){
        int n=1;
        printArray(n);
    }
    
}
