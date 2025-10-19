class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
public class penOOPs {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        Pen pen2=new Pen();
        pen2.color="green";
        pen2.type="BallPoint";
        pen1.printColor();
        pen1.printType();
        pen2.printColor();
        pen2.printType();
    }
}
