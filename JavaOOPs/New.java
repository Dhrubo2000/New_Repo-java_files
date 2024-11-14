public class New {
    public static void main(String[] args) {
        
        New_Student st = new New_Student();

        st.setName("dhrubo");
        st.setAge(24);
        st.setrollnumber(29);
        // System.out.println(st.getAge());

        st.display();
    }
}

class New_Student{

    private String name;
    private int rollnumber;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setrollnumber(int rollnumber){
        this.rollnumber = rollnumber;
    }

    public void setAge(int age){
        this.age = age;
    }


    public String getName(){
        return this.name;
    }

    public int getrollnumber(){
        return this.rollnumber;
    }

    public int getAge(){
        return this.age;
    }

    public void display(){
        System.out.println(getName() + "," + getrollnumber() + "," + getAge());
    }


}