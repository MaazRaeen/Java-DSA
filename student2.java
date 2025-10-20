class Student{
        String name;
        int age;
        public void sInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(String name, int age){
            this.name=name;
            this.age=age;
        }
    }
    
public class student2 {
    
    public static void main(String[] args) {
        Student s1=new Student("maaz", 20);
        s1.sInfo();
    }
}
