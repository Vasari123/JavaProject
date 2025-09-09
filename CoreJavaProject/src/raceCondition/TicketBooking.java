package raceCondition;

public class TicketBooking implements Runnable {

    int availableTickets = 1;

    @Override
    public void run() {
        System.out.println("Waiting to book the Ticket " + Thread.currentThread().getName());
        if (availableTickets > 0) {
            System.out.println("Booking ticket for : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            availableTickets--;
            System.out.println("Tickets booked for " + Thread.currentThread().getName());
            System.out.println("Available tickets " + availableTickets);
        } else {
            System.out.println("Tickets not booked for " + Thread.currentThread().getName());
        }
    }
}
