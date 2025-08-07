import java.util.*;
public class avgno {
    public static void  AvgNo(int a , int b, int c){
        int n=a+b+c;
        float avg=(float)n / 3;
        System.out.println("avg of all these 3 no :"+avg);
        return ;
    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        AvgNo(a, b, c); 
        

    }
    
}
