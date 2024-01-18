package threads.commonResource;

public class Thread1 extends Thread{

    CommonResource commonResource;

    public Thread1(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        commonResource.pro();
    }
}
