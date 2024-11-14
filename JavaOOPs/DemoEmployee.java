public class DemoEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("dhrubo", 1000, "senior developer");
        manager.displayDetails();
    }
}

class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

}

class Manager extends Employee {

    private String department;

    public Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String getDept(){
        return this.department;
    }

    public void displayDetails(){
        System.out.println(getName() + "," + getSalary() + "," + getDept());
    }
}