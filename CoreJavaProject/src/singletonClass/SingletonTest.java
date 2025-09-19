package singletonClass;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            Singleton singleton = Singleton.getSingleton();
            singleton.showMessage();
        };
        Thread thread1 = new Thread(runnable, "Task-1");
        Thread thread2 = new Thread(runnable, "Task-2");
        thread1.start();
        thread2.start();
    }
}
