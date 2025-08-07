import java.util.*;
public class array1 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        // for input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        // int[] marks={99,97,93};
        // marks[0]=95;
        // marks[1]=98;
        // marks[2]=99;
        // System.out.println(marks[0]);

        //for output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

    }
}
