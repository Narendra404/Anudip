package threads.interrupts;

public class Interrupts implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(1000);
                    Thread.currentThread().interrupt();
// System.out.println(Thread.interrupted());
//System.out.println(Thread.currentThread().isInterrupted());
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Hello " + e);
                }
            }
        }
    }
}
