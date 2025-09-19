package threadsInterCommunication;

public class Message {
    private String msg;
    private boolean hasMessage = false;

    public synchronized String take() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Receiver interrupted: " + e.getMessage());
            }
        }
        hasMessage = false;
        notifyAll();
        return msg;
    }

    public synchronized void put(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Sender interrupted: " + e.getMessage());
            }
        }
        this.msg = msg;
        hasMessage = true;
        notifyAll();
    }
}
