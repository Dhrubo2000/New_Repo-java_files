package Test;

public class Demo_character {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.attack();

        Archer archer = new Archer();
        archer.attack();
    }
}

abstract class GameCharacter {
    public abstract void attack();
}

class Warrior extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("i use sword....");
    }
}

class Archer extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("i use bow and arrow....");
    }
}
