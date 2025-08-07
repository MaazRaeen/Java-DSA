class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of two integers: " + calculator.add(5, 17));
        System.out.println("Addition of three integers: " + calculator.add(5, 13, 19));
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 10.5));
        
    }
}
