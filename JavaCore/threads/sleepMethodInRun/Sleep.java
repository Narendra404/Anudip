package threads.sleepMethodInRun;

import java.util.Arrays;

public class Sleep implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("sleep() method has started for : " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("sleep() method has ended for : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

class App {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Sleep());
        t1.start();
        Thread t2 = new Thread(new Sleep());
        t2.start();
    }
}
