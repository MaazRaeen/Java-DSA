class Student{
        String name;
        int age;
        public void sInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }
public class student1 {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Maaz";
        s1.age=20;
        s1.sInfo();
    }
}
