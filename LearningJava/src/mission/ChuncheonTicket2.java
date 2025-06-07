package mission;

public class ChuncheonTicket2 {
    public static void main(String[] args) {
        int totalTickets = 625;
        int dividedTickets = 3;
        int MaxTicketsPeople = totalTickets / dividedTickets;
        int leftTickets = totalTickets % dividedTickets;

        System.out.println(MaxTicketsPeople);
        System.out.println(leftTickets);
    }
}
