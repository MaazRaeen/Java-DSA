public class BitsClear {
    public static void main(String args[]){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int not=~bitMask;
        int number=not&n;
        System.out.println(number);
    }
}
