interface Animal{
    int eyes=2;     //->can't change the in wholr program
    void walk();    //-> default public
    
}
class Horse implements Animal{
    public void walk(){
        System.out.println("walks on 4 leg");
    }
}
public class interfaceAnimal {
    public static void main(String[] args) {
        Horse horse =new Horse();
        horse.walk();
    }
}
