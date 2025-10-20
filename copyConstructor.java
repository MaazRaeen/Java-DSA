class Student{
    String name;
    int age;
    public void sInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }

}
public class copyConstructor {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.name="maaz";
       s1.age=20;
       Student s2 = new Student(s1);
       s2.sInfo();
    }
}
