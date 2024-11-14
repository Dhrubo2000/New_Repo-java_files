package AccessModifiers.Test;

import AccessModifiers.Zoo.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("bob");
        dog.makeSound();
        dog.setSound("woof");
        dog.makeSound();
        dog.wigTail();
    }
}
 