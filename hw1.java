import java.util.*;
public class hw1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        // double sum= a+b;
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("sum ="+(a+b));
            break;
            case 2:System.out.println("subtraction="+(a-b));
            break;
            case 3:System.out.println("multiply="+(a*b));
            break;
            case 4:if(b==0){
                System.out.println("invalid division");
            }else{
            System.out.println("divide="+(a/b));}
            break;
            case 5:if(b==0){
                System.out.println("invalid division");
            }else{
            System.out.println("module="+(a%b));}
            break;
            default:System.out.println("invalid");
        }
    }
}