package Interface.Practice;

public class MainShape {
    public static void main(String[] args) {
        Square square = new Square(2);
        square.calculateArea();

        Circle circle = new Circle(2);
        circle.calculateArea();
    }
}

interface Shape{
    abstract void calculateArea();
}

class Square implements Shape{

    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    @Override
    public void calculateArea(){
        int sides = getSide();
        int res = sides * sides;
        System.out.println(res);

    }
}

class Circle implements Shape{

    final double pi = 3.14;
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public void calculateArea(){
        int r = getRadius();
        double area = pi * r * r;
        System.out.println(area);
    }
}
