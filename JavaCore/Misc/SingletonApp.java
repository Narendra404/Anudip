package Misc;

 class Singleton {

    private static Singleton singleton;
    private static int count;

    private Singleton() {

        count++;
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void display() {

        System.out.println(count);
    }
}

public class SingletonApp {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        s1.display();
        s2.display();
        s3.display();
    }
}