package Threading;


public class My_thread extends Thread {

    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {

        My_thread t1 = new My_thread();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(100);

    }
}
