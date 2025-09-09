package raceCondition;

public class TicketBookingTest {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        Thread t1 = new Thread(ticketBooking, "Passenger-1 Thread");
        Thread t2 = new Thread(ticketBooking, "Passenger-2 Thread");
        t1.start();
        t2.start();
    }
}
