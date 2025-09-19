package threadsInterCommunication;

public class Receiver implements Runnable {

    private Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String receivedMessage;
        do {
            receivedMessage = message.take();
            System.out.println("Received: " + receivedMessage);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } while (!receivedMessage.equals("End"));
    }
}
