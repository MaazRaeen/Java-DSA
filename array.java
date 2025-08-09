import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();        
        }
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("founs at index"+i);
            }
            // System.out.print(arr[i]+"\t");

        }
    }
}
