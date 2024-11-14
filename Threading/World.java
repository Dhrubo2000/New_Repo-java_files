package Threading;

public class World implements Runnable {
    
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("world");
        }
    }
}
