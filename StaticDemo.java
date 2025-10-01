// Demonstrating static variables and static methods in Java
class StaticDemo {
    
    // Static variable
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter = 0;

    // Constructor increments both static and instance counters
    StaticDemo() {
        staticCounter++;    // Increments the static counter (shared across all instances)
        instanceCounter++;  // Increments the instance counter (unique to each instance)
    }

    // Static method to access static variable
    static void showStaticCounter() {
        System.out.println("Static counter (shared): " + staticCounter);
    }

    // Instance method to access instance variable
    void showInstanceCounter() {
        System.out.println("Instance counter (unique): " + instanceCounter);
    }
}

class Main {
    public static void main(String[] args) {
        
        // Accessing static method without creating an object
        StaticDemo.showStaticCounter(); // Output: Static counter (shared): 0
        
        // Creating first instance
        StaticDemo obj1 = new StaticDemo();
        obj1.showInstanceCounter(); // Output: Instance counter (unique): 1
        StaticDemo.showStaticCounter(); // Output: Static counter (shared): 1

        // Creating second instance
        StaticDemo obj2 = new StaticDemo();
        obj2.showInstanceCounter(); // Output: Instance counter (unique): 1
        StaticDemo.showStaticCounter(); // Output: Static counter (shared): 2
        
        // Creating third instance
        StaticDemo obj3 = new StaticDemo();
        obj3.showInstanceCounter(); // Output: Instance counter (unique): 1
        StaticDemo.showStaticCounter(); // Output: Static counter (shared): 3
    }
}
