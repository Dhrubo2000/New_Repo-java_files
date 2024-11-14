package Threading;

public class Test {
    public static void main(String[] args) {

        World world = new World();

        // world.start();

        Thread t1 = new Thread(world);
        t1.start();

        for (int i = 1; i < 100; i++) {
            System.out.println("hello");
        }
        // System.out.println(Thread.currentThread().getName());  //shows which thread is running
    }
}
