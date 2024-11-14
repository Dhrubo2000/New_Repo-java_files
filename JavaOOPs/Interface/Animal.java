package Interface;

public interface Animal {
    
    int age = 10; //static variable
    public abstract void eat();

    void sleep(); //by default its abstract 

    public static void info(){
        System.out.println("this is animal");
    }

    default void run(){
        System.out.println("animal is running");
    }
}
