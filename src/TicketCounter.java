public class TicketCounter {
    private int available_seats = 5;

    public synchronized void bookticket(String name, int number_of_seats) {
        if (number_of_seats <= available_seats && number_of_seats > 0) {
            System.out.println("Hi " + name + ", you have booked " + number_of_seats + " tickets successfully.");
            available_seats = available_seats - number_of_seats;
            System.out.println("Available seats left: " + available_seats);
        } else {
            System.out.println("Sorry, " + name + ", seats are not available.");
        }
    }
}

