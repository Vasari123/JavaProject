package threadsInterCommunication;

public class Sender implements Runnable {

    private Message message;

    public Sender(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "World", "Java", "Concurrency", "End"};
        for (String m : messages) {
            message.put(m);
            System.out.println("Sent: " + m);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
