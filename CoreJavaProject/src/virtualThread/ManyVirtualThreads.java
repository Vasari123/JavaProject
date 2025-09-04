package virtualThread;

public class ManyVirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.ofVirtual().start(() -> {
                System.out.println("Running in " + Thread.currentThread());
                try {
                    Thread.sleep(1000); // blocking call is fine
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        Thread.sleep(2000);
    }
}
