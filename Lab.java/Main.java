class Person {
    private String name;
    private int age;
    private String course;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Enrolled";
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Enrolled";
    } 
    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Enrolled";
    }
    public Person(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); 
        Person person2 = new Person("Priyanshu"); 
        Person person3 = new Person("Mohit", 19);
        Person person4 = new Person("Maaz", 19,"CSE"); 

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
        
    }
}
