import java.util.Scanner;

public class nthRowOfPascleTriangle {
    public static void main(String[] args) {
        int ans = 1;
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        // int col = sc.nextInt();
        for(int i =0; i<=row; i++){
            System.out.println(ans); 
            ans = ans * (row-i);
            ans = ans/(i+1);
            
        }
        System.out.println();
    }
}
