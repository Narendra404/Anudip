package threads.createThreadWithThread;

public class CreateThread extends Thread {
    public CreateThread() {
        System.out.print("Hello : ");
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class App {
    public static void main(String[] args) {

        CreateThread obj = new CreateThread();
        obj.start();
        obj.setName("Thread One");
    }
}
