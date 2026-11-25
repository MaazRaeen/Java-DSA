// program to find nth row mth col val in pascle triangle
import java.util.*;
public class pascleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // int col = sc.nextInt();
        int col = sc.nextInt();
        int res=1;
        for(int i =0; i<col; i++){
            res = res * (row-i);
            res = res/(i+1);
        }
        System.out.println(res);
    }
}
