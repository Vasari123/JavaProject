package virtualThread;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from Virtual Thread: " + Thread.currentThread());
        });

        vThread.join();
    }
}
