public class TicketBookingThread extends Thread{

    private TicketCounter ticketCounter;
    private String pname;
    private int no_seats;

    public TicketBookingThread(TicketCounter ticketCounter,String pname,int no_seats) {
        this.ticketCounter = ticketCounter;
        this.pname=pname;
        this.no_seats=no_seats;

    }

    @Override
    public void run() {
       ticketCounter.bookticket(pname,no_seats);
    }



}
