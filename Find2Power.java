import java.util.*;
public class Find2Power {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0&&(n&(n-1))==0){
            System.out.println("yes it is 2 power");
        }else{
            System.out.println("no it is not 2 power");
        }
    }
}