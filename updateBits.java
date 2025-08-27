import java.util.*;
public class updateBits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=2;
        int bitmask1=1<<pos;
        if(oper==1){
            int newnumber=bitmask1|n;
            System.out.println(newnumber);
        }else{
            int newbitmask=~bitmask1;
            int newnumber=newbitmask&n;
            System.out.println(newnumber);
        }
    }
}
