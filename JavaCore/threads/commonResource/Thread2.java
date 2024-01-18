package threads.commonResource;

public class Thread2 extends Thread{

    CommonResource commonResource;

    public Thread2(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        commonResource.pro();
    }
}
