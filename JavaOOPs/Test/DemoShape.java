package Test;

public class DemoShape {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rect = new Rectangle(10, 2);
        circle.area();
        rect.area();
    }
}

abstract class Shape {

    public abstract void area();

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public void area(){
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    @Override
    public void area(){
        double area = length * breadth;
        System.out.println(area);
    }
}
