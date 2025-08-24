import java.util.*;
public class ArrString {
    public static void main(String arga[]){
        Scanner sc=new Scanner(System.in);
        int name=sc.nextInt();
        String arr[]=new String[name];
        int totallength=0;
        for(int i=0;i<name;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<name;i++){
            totallength+=arr[i].length();
        }
        System.out.println(totallength);
    }
}
