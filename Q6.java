import java.util.*;
public class Q6 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int table=sc.nextInt();
        // int table=1;
        for (int i=1;i<=10;i++){
           
            System.out.println(table + "*" +i + "="+(i*table));
        }
    }
}
