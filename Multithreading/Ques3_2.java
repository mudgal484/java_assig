package Multithreading;

class TicketBookingCounter2 {
        int ticketsAvailable = 2;
synchronized void bookTicket(String name, int ticketsToBook) {
        if((ticketsAvailable >= ticketsToBook) && (ticketsToBook > 0)) {
        System.out.println(name+" : "+ ticketsToBook + " Tickets Booked Successfully");
        ticketsAvailable -= ticketsToBook;
        } else {
        System.out.println(name +" : No Tickets are Available");
        }
        }
        }
class TicketCounterThread2 extends Thread {
    TicketBookingCounter2 thread;
    String name;
    int tickets;
    TicketCounterThread2(TicketBookingCounter2 thread, String name, int tickets) {
        this.thread = thread;
        this.name = name;
        this.tickets = tickets;
    }
    public void run() {
        thread.bookTicket(name, tickets);
    }
}

public class Ques3_2 extends Thread {
    public static void main(String[] args) {
        TicketBookingCounter2 tc = new TicketBookingCounter2();
        TicketCounterThread2 thread1 = new TicketCounterThread2(tc, "Ram", 2);
        TicketCounterThread2 thread2 = new TicketCounterThread2(tc, "Sham", 1);
        TicketCounterThread2 thread3 = new TicketCounterThread2(tc, "Krishna", 3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
