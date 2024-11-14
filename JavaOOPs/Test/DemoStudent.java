package Test;

public class DemoStudent {
    public static void main(String[] args) {
        Student student = new Student("dhrubo" , 0, 2018701124);
        student.display();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void display(){
        if(this.age > 3){
            System.out.println("eligible for admission....");
        }else{
            System.out.println("not eligible for admission.....");
        }
    }
}

class Student extends Person {

    private long studentId;

    public Student(String name, int age, long studentId){
        super(name, age);
        this.studentId = studentId;
    }

    public long getId(){
        return this.studentId;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(getName() + "," + getAge() + "," + getId());
    }
}