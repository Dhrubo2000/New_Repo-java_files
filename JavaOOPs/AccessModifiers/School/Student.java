package AccessModifiers.School;

public class Student {
    public String name;
    public int age;

    public static int count = 0;

    public Student(){
        count++;
    }

    

    public static void sayHello(){
        System.out.println("i am a student....");
    }
}
