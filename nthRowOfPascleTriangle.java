import java.util.Scanner;

public class nthRowOfPascleTriangle {
    public static void main(String[] args) {
        int ans = 1;
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        // int col = sc.nextInt();
        for(int i =1; i<=row; i++){
            System.out.println(ans); 
            ans = ans * (row-i);
            ans = ans/(i);
            
        }
        System.out.println();
    }
}
