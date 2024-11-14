package Innerclasses;

public class Test {
    public static void main(String[] args) {

        //Class Car with the inner member class engine
        // Car car = new Car("tata safari");

        // Car.Engine engine = car.new Engine();
        // engine.start();
        // engine.stop();



        // Computer computer = new Computer("asus", "vivobook", "windows");
        // computer.getosName().displayInfo();

        // Computer.USB usb = new Computer.USB("Type-c");
        // usb.display();

        // ShoppingCart shoppingCart = new ShoppingCart(200);
        // shoppingCart.processPayment(new Payment() {
        //     @Override
        //     public void pay(double amount){
        //         System.out.println("Paid " + amount + " using Credit Card");
        //     }
        // });

        Hotel hotel = new Hotel("hotel", 10, 5);
        hotel.reserveRooms("dhrubo", 15);
    }
}
