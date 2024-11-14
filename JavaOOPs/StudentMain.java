
class Student{
    String name;
    int std;

    Student(String name, int std){
        this.name = name;
        this.std = std;
    }

    public void display(String name, int std){

        System.out.println("the name of the stuent is "+ name);
        System.out.println("the std of the stuent is "+ std);

        System.out.println("after applying this  ----->");

        System.out.println("the name of the stuent is "+ this.name);
        System.out.println("the std of the stuent is "+ this.std);

        //here if we use this.name and this.std then dhrubo and 6 will be printed even if we 
        //pass a particular value to the function
    }
}

public class StudentMain {
    
    public static void main(String[] args) {
        Student st1 = new Student("john", 9);
        

        //if we declare the name and std with the object then the value in the constructor will be overwritten 
        st1.name = "dhrubo";
        st1.std = 6;

        st1.display("ghost", 141);
        
    }
}   
