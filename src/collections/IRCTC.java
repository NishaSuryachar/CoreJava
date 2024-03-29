package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class IRCTC
{
    LinkedHashSet<Ticket> ticket=new LinkedHashSet();
    Scanner sc=new Scanner(System.in);
    public void bookTicket(Ticket t)
    {
    	if(ticket.add(t))
    		{
    			System.out.println("Ticket Booked");
    		}
    		else
    		{
    			System.out.println("Ticket not Booked");
    		}
        }
    public void showTicktDetails(int ticket_no)
    {
    	for(Ticket s:ticket)
    	{
    		if(s.ticket_no==ticket_no)
    		{
    			System.out.println("=====Ticket Details=======");
    			System.out.println("Ticket NO "+s.ticket_no);
    			System.out.println("Passenger Name "+s.passenger_name);
    			System.out.println("Departure "+s.departure);
    			System.out.println("Destination "+s.destination);
    			return;
    		}
    	}
    	System.out.println("Ticket Doesn't exist");
    }
    public void removeTicket(int ticket_no)
    {
    	for(Ticket s:ticket)
    	{
    		if(s.ticket_no==ticket_no)
    		{
    			ticket.remove(s);
    			System.out.println("Ticket Removed successfully");
    			return;
    		}
    	}
    	System.out.println("Ticket Doesn't exist");
    }
}
