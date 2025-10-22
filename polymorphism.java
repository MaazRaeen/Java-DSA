class Student{
    String name;
    int age;
    public void sInfo(String name){
        System.out.println(name);
    }
    public void sInfo(int age){
        System.out.println(name);
    }
    public void sInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Maaz";
        s1.age=20;
        s1.sInfo(s1.name, s1.age);
    }
    

}
