package Interface.Practice;

public class Test_print {
    public static void main(String[] args) {
        
        Printer printer = new Printer();
        printer.info();
        printer.print();
    }
}

interface Printable {

    abstract void print();

    default void info(){
        System.out.println("i am printing....");
    }
}

interface Scannable {

    abstract void scan();

    default void newinfo(){
        System.out.println("i am scanning....");
    }
}

class Printer implements Printable, Scannable {

    public Printer(){
        System.out.println("i am running");
    }

    @Override
    public void print(){
        System.out.println("printing info !!!");
    } 

    @Override
    public void scan(){
        System.out.println("scanning info !!!");
    }

}
