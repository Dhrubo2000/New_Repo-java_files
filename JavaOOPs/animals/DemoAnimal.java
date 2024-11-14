package animals;

public class DemoAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sayHello();
        cat.eat();
    }
}

class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("this is animal");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("animals eat food.....");
    }

    public void sayHello() {
        System.out.println("i speak...");
    }

}

class Dog extends Animal {

    public Dog() {
        System.out.println("i am a dog");
    }

    // method over-riding
    public void sayHello() {
        System.out.println(("hello"));
        super.eat();
    }


}

class Cat extends Animal {

    public Cat() {
        System.out.println("i am a cat");
    }

    @Override
    public void sayHello() {
        System.out.println("meow");
    }
}
