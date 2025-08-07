class Pen{
    String color;
    String type;

public void write(){
    System.out.println("write something");

}
public void colorprint(){
    System.out.println(this.color);
}
}
public class oops1 {
    public static void main(String[] args) {
        
    
    Pen pen1=new Pen();
    pen1.color="blue";
    pen1.type="ball";
    Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="gel";
    pen1.colorprint();
    pen2.colorprint();
    pen1.write();

}
}