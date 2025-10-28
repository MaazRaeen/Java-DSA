abstract class Animal{
    abstract void walks();
}
class Horse extends Animal{
    public void walks(){
        System.out.println("walks on 4 leg");
    }
}
class Cock extends Animal{
    public void walks(){
        System.out.println("walks on 2 leg");
    }
}
public class Encapculation {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walks();
    }
}
