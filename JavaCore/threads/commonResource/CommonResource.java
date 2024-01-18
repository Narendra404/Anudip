package threads.commonResource;

public class CommonResource {
    public synchronized void pro() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println();
    }
}

// Ways to synchronize :
// 1. synchronize
// 2. lock
// 3. atomic variable