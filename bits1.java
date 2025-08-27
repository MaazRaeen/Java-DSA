public class bits1 {
    public static void main(String args[]){
        int n=5;
        int pos=2;
        int bits=1<<pos;
        if((bits & n )== 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
