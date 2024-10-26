//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       TicketCounter t_counter=new TicketCounter();
       TicketBookingThread t1=new TicketBookingThread(t_counter,"Tharu",2);
        TicketBookingThread t2=new TicketBookingThread(t_counter,"John",2);
        TicketBookingThread t3=new TicketBookingThread(t_counter,"Peter",2);

        t1.start();
        t2.start();
        t3.start();

    }
}