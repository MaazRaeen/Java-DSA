public class BitsSet {
    public static void main(String args[]){
        int n=2;
        int pos=3;
        int bitMask=1<<pos;
        int number=bitMask|n;
        System.out.println(number);
    }
}
