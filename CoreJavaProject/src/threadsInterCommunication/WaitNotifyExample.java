package threadsInterCommunication;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Message message = new Message();
        Thread senderThread = new Thread(new Sender(message));
        Thread receiverThread1 = new Thread(new Receiver(message));
        Thread receiverThread2 = new Thread(new Receiver(message));

        senderThread.start();
        receiverThread1.start();
        receiverThread2.start();
    }
}
