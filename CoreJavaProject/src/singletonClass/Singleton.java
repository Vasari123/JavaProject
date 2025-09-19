package singletonClass;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("Singleton instance created by " + Thread.currentThread().getName());
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton! " + Thread.currentThread().getName());
    }
}
