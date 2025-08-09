import java.util.*;
public class sortedArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);    
        int size=sc.nextInt();
        int[] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                sorted=false;
            }
        }
        if(sorted){
            System.out.println("Array is sorted ");
        } else {
            System.out.println("Array is not sorted ");
        }
    }
}
