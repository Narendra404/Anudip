package threads.sleepMethodOutOfRun;

import java.util.Arrays;

public class Sleep implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread : " + Thread.currentThread().getName());
    }
}