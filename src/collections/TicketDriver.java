package collections;

import java.util.Scanner;

public class TicketDriver {

	public static void main(String[] args)
	{
		IRCTC t1=new IRCTC();
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter the choice");
			System.out.println(" 1.BookTicket\n 2.ShowTicketDetails\n 3.RemoveTicket\n 4.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
			      System.out.println("Enter the ticket number");
			      int ticket_no=sc.nextInt();
			      System.out.println("Enter the passenger Name");
			      String passenger_name=sc.next();
			      System.out.println("Enter the Departure");
			      String departure=sc.next();
			      System.out.println("Enter the Destination");
			      String destination=sc.next();
			      t1.bookTicket(new Ticket(ticket_no,passenger_name,departure,destination));
			}
			break;
			case 2:
			{
				System.out.println("Enter the ticket no");
				int ticket_no=sc.nextInt();
				t1.showTicktDetails(ticket_no);
			}
			break;
			case 3:
			{
				System.out.println("Enter the ticket no");
				int ticket_no=sc.nextInt();
				t1.removeTicket(ticket_no);
			}
			break;
			case 4:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
		}
	}

}

}
