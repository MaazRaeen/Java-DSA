import java.util.*;
public class FindMinimum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        int[] number=new int[size];
        System.out.println("Enter"+size+"integers");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("the minimum number in array is "+min);

    }

}
