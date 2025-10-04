public class placetiles {
    public static int printTiles(int n, int m){
        if(n==m) return 2;
        if(n<m) return 1;
        // vertically
        int ver=printTiles(n-m, m);
        //horizontally
        int hor=printTiles(n-1, m);
        return ver+hor;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(printTiles(n, m));
    }
}
