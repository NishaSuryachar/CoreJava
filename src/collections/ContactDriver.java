package collections;

import java.util.Scanner;

public class ContactDriver {

	public static void main(String[] args)
	{
		ContactBook c1=new ContactBook();
		Scanner sc=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
        	System.out.println("Enter your choice");
            System.out.println("1:AddContact\n 2:RemoveContact\n 3:SearchContact\n 4:exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                 case 1:
                 {
                	 System.out.println("Enter Contact name");
                	 String cname=sc.next();
                	 System.out.println("Enter Contact number");
                	 long cno=sc.nextLong();
                	 c1.addContact(new Contact(cname,cno));
                 }
                 break;
                 case 2:
                 {
                	 System.out.println("Enter Contact name you want to Remove");
                	 String cname=sc.next();
                	 c1.removeContact(cname);
                 }
                 break;
                 case 3:
                 {
                	 System.out.println("Enter Contact name you want to search");
                	 String cname=sc.next();
                	 c1.contactDetails(cname);
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
