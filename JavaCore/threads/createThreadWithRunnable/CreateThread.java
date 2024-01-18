package threads.createThreadWithRunnable;

public class CreateThread implements Runnable {

    public CreateThread() {
        System.out.print("Hello : ");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class App {
    public static void main(String[] args) {

        Thread th = new Thread(new CreateThread());
        th.start();
        th.setName("Thread One");
    }
}
