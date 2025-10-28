class Shape{
    public void area(){
        System.out.println("Display Area: ");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*h*l);
    }
}
class Circle extends Shape{     //---> hirarichal
    public void area(int r){
        System.out.println((3.14)*r*r); 
    }
}
public class hirarichalInheritance {
    public static void main(String[] args) {
        
    }
}
