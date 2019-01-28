package bus.reservation.system;

import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

public class TestBusReservation {

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"John",20);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Martin",20);
        
        t1.start();
        t2.start();
    }
}