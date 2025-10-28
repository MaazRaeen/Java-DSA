abstract class Animal{
    abstract void walks();
    public void eats(){
        System.out.println("Animal Eats");
    }
    Animal(){
        System.out.println("created a  new Animal ");       //-->constructer
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a  new horse");       //-->constructer
    }
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
        h.eats();
    }
}
