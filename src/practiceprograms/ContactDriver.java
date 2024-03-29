package practiceprograms;

import java.util.Scanner;

public class ContactDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ContactBook cb=new ContactBook();
		boolean exit=true;
		while(true)
		{
		System.out.println("enter your choose");
		System.out.println("1.addcontact\n 2.removeContact\n 3.showDetails\n 4.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter cname");
			String cname=sc.next();
			System.out.println("Enter cno");
			int cno=sc.nextInt();
			cb.addContact(new Contact(cname,cno));
		}
		break;
		case 2:
		{
			System.out.println("Enter cname");
			String cname=sc.next();
			cb.removeContact(cname);
		}
		break;
		case 3:
		{
			System.out.println("Enter cname");
			String cname=sc.next();
			cb.showDetails(cname);
		}
		break;
		case 4:
		{
			exit=false;
		}
		break;
		default:
		{
		  System.out.println("Invalid choice");
		}
		
		}
	}
	}
}
