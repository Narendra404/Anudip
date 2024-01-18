package threads.counter;

public class App {
    public static void main(String[] args) {
        Counter counter1 = new Counter(1);
        Counter counter2 = new Counter(2);

        long startTime = System.currentTimeMillis();
        counter1.start(); // Run should be called by JVM
        System.out.println("**************************");
        counter2.start(); // Run should be called by JVM

        try {
            Thread.sleep(4505);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total time required to process: " + (endTime - startTime));
    }
}

