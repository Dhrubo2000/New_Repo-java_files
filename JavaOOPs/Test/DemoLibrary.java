package Test;

public class DemoLibrary {
    public static void main(String[] args) {
        // Library[] items = new Library[3];
        // items[0] = new Book("zero to hero", "peter thiel", 300);
        // items[1] = new DVD("intersteller", "christopher nolan", 3);
        // items[2] = new Book(null, null, 0);

        Library[] items = {new Book("zero to hero", "peter thiel", 300), new DVD("intersteller", "christopher nolan", 3)};

        for (Library library : items) {
            library.displayInfo();
        }

    }
}


class Library {

    private String title;

    public Library(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void displayInfo(){
        System.out.println("the title of the book : "+ this.title);
    }

}

class Book extends Library{
    private String author;
    private int pages;

    public Book(String title, String author, int pages){
        super(title);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPages(){
        return this.pages;
    }

    @Override
    public void displayInfo(){
        System.out.println("the title of the book : " + getTitle());
        System.out.println("the author of the book : " + getAuthor());
        System.out.println("the pages of the book : " + getPages());
        System.out.println();
    }
}

class DVD extends Library{
    private String author_DVD;
    private float duration;

    public DVD(String title, String author_DVD, float duration){
        super(title);
        this.author_DVD = author_DVD;
        this.duration = duration;
    }

    public String getAuthor_DVD(){
        return this.author_DVD;
    }

    public float getDuration(){
        return this.duration;
    }

    @Override
    public void displayInfo(){
        System.out.println("the title of the DVD : " + getTitle());
        System.out.println("the author of the DVD : " + getAuthor_DVD());
        System.out.println("the duration of the DVD : " + getDuration());
        System.out.println();
    }
}
