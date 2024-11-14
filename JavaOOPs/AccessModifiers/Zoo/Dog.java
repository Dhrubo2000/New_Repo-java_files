package AccessModifiers.Zoo;

public class Dog extends Animal {
    
    public Dog(String name){
        super(name, "bark");
    }

    public void wigTail(){
        System.out.println(getName() + "is wagginf its tail");
    }

    private String getName(){
        return getClass().getSimpleName();
    }

    public void setSound(String newSound){
        changeSound(newSound);
    }
}
