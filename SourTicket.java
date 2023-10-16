package com.cg;
import java.util.*;
public class SourTicket {
	
	 

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
	        Ticket t = new Ticket();

	 

	        System.out.println("Enter no of bookings:");
	        int no = s.nextInt();

	 

	        System.out.println("\nEnter the available tickets:");
	        int availableTicket = s.nextInt();
	        t.setAvailableTickets(availableTicket);

	 

	        while (no > 0) {
	            System.out.println("\nEnter the ticketid:");
	            int tickedId = s.nextInt();
	            t.setTicketid(tickedId);

	 

	            System.out.println("\nEnter the price:");
	            int price = s.nextInt();
	            t.setPrice(price);

	 

	            System.out.println("\nEnter the no of tickets:");
	            int bookTickets = s.nextInt();

	 

	            System.out.println("\nAvailable tickets:" + t.getAvailableTickets());

	            System.out.println("\nTotal amount:" + t.calculateTicketCost(bookTickets));
	            System.out.println("\nAvailable ticket after booking:" + t.getAvailableTickets());

	 

	            no--;
	        }
	    }

	 

		}

	 

