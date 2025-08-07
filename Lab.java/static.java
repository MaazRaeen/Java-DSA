 public class static1{

    static int sc = 0;

    int it;
    
    Static(int value) {
        this.it = value;  
        sc++;  
    }
    static void staticM() {
        st++;
        System.out.println("Static Counter : " + sc);
    }

    void instanceM() {
        System.out.println("Instance Variable : " + it);
    }
}

    public static void main(String[] args) {
        Static1 obj1 = new Static(10);
        Static1 obj2 = new Static(20);

        Static.staticM(); 
        System.out.println(" static variable sc: " + Static.sc); 
    
        obj1.instanceM(); 
        obj2.instanceM(); 
         
    }

        

