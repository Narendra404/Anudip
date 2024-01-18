package threads.commonResource;

public class App {
    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();

        Thread1 th1 = new Thread1(commonResource);
        Thread2 th2 = new Thread2(commonResource);
        th1.start();
        th2.start();
    }
}
