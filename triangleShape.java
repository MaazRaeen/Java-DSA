// Inheritance SingleLevel & MultiLevel
class Shape{
    public void area(){
        System.out.println("Display Area: ");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){         //---> SingleLevel
        System.out.println(1/2*h*l);
    }
}
class EqilateralTriAngle{
    public void area(int l, int h){         //--->MultiLevel
        System.out.println(1/2*h*l);
    }
}
public class triangleShape {

    public static void main(String[] args) {
        
    }
}
