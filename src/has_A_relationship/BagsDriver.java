package has_A_relationship;

import java.util.Scanner;

public class BagsDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bag Name");
		String bagName=sc.next();
		Bags b1=new Bags(bagName);
		boolean exit=true;
		while(exit)
		{
			System.out.println("1.ADDBOOK\n 2.REMOVEBOOK\n 3.UPDATEBOOKNAME\n 4.DISPLAYBOOKDETAILS");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the Book Name");
				String book_name=sc.next();
				System.out.println("Enter the Book id");
				int book_id=sc.nextInt();
				System.out.println("Enter the Book price");
				double book_price=sc.nextDouble();
				b1.addBook(new Book1(book_name,book_id,book_price));
			}
			break;
			case 2:
			{
				b1.removeBook();
			}
			break;
			case 3:
			{
				b1.updateBookName();
			}
			break;
			case 4:
			{
				b1.displayBookDetails();
			}
			break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
                System.out.println("Invalid choice");
			}
		    break;
			}
		}
		
		
	}

}
