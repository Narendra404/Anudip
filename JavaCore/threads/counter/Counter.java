package threads.counter;

public class Counter extends Thread {
    private int threadNo;

    public Counter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for (int i = 1; i <= 9; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("The value if i is: " + i + " and the thread number is: " + threadNo);
        }
    }
}
