package Innerclasses.Practice;

public class Library {
    
    private String name;

    public void setName(String name){
        this.name = name;
    }

    class Book{
        public String getName(){
            return name;
        }
    }
}


