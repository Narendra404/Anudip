package threads.join;

import java.util.Arrays;

public class Join {

    public int counter = 0;

    public static void main(String[] args) {

        Join join = new Join();

        System.out.println("Thread name \t Counter value");
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    join.counter++;
                    System.out.println(Thread.currentThread().getName() + "\t\t\t\t" + join.counter);
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    th1.join(2000);
                } catch (InterruptedException e) {
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }
                for (int i = 0; i < 10; i++) {
                    join.counter++;
                    System.out.println(Thread.currentThread().getName() + "\t\t\t\t" + join.counter);
                }
            }
        });

        th1.start();
        th2.start();

        try {
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
