package Innerclasses.Practice;

import Innerclasses.Practice.Container.Item;

public class NewTest {
    public static void main(String[] args) {

        // Outer outer = new Outer(10);
        // Outer.Inner inner = outer.new Inner();

        // inner.showx();
        

        // Library library = new Library();
        // library.setName("new Library");

        // Library.Book book = library.new Book();
        // System.out.println(book.getName());

        // System.out.println(Item.incrementCount());
        // System.out.println(Item.incrementCount());

        MathOperation operation = new MathOperation();
        operation.calculateSum(1, 2);
    }
}
