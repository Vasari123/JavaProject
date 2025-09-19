package singletonClass;

public class Singleton1Test {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            Singleton1 singleton1 = Singleton1.getSingleton();
            singleton1.showMessage();
        };
        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
