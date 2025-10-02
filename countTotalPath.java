public class countTotalPath {
    public static int countPath(int i, int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        // downpath
        int downPath=countPath(i+1, j, n, m);
        //rigth path
        int rigthPath=countPath(i, j+1, n, m);
        return rigthPath+downPath;

    }
    public static void main(String[] args) {
        int n=4,m=4;
        int totalPath=countPath(0, 0, n, m);
        System.out.println(totalPath);
    }
}
