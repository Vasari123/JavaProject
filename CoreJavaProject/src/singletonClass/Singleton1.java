package singletonClass;

public class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1() {
        System.out.println("Singleton instance created by " + Thread.currentThread().getName());
    }

    public static  Singleton1 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton " + Thread.currentThread().getName());
    }

}
