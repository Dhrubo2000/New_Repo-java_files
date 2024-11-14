package Innerclasses.Practice;

public class Outer {
    
    private int x;

    public Outer(int x){
        this.x = x;
    }

    public void displayx(){

        System.out.println("the value of x : " + x);

    }

    class Inner{

        public void showx(){
            
            displayx();

        }
    }
}
