package Innerclasses.Practice;

public class Container {
    
    static int count = 0;

    static class Item { 

        static int incrementCount(){
            return ++count;
        }

    }

}
