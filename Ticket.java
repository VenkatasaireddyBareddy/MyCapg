package com.cg;

public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}

 

 

	public static void setAvailableTickets(int availTicket) {
        if (availTicket > 0)
            availableTickets = availTicket;
    }



	public int calculateTicketCost(int nooftickets) {
        int tik = getAvailableTickets();
        if (nooftickets > tik)
            return -1;
        tik -= nooftickets;
        setAvailableTickets(tik);
        return price * nooftickets;
    }

}
