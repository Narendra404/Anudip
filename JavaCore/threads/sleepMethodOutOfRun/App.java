package threads.sleepMethodOutOfRun;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Sleep());
        t1.start();
        Thread t2 = new Thread(new Sleep());
        t2.start();

        try {
            t1.sleep(5000);
            t2.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

