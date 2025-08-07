public class invertedhalfpyramid180deg {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            // inner loop-->for space
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            }
            // inner loop for sta
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
