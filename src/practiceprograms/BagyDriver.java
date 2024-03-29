package practiceprograms;

import java.util.Scanner;

public class BagyDriver
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	Bag bg=new Bag("aprikot");
        boolean exit=true;
    	while(exit)
    	{
    	System.out.println("Enter your choice");
    	System.out.println("1.addbook\n 2.removebook\n 3.updatebookname\n 4.bookdetails\n 5.exit");
    	int choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    	{
    		System.out.println("Enter book name");
    		String book_name=sc.next();
    		System.out.println("Enter the book id");
    		int book_id=sc.nextInt();
    		System.out.println("Enter the book price");
    		double book_price=sc.nextDouble();
        	bg.addBook(new Boo(book_name,book_id,book_price));
    	}
    	break;
    	case 2:
    	{
    		bg.removeBook();
    	}
    	break;
    	case 3:
    	{
    		
    		bg.updateBookName();
    	}
    	break;
    	case 4:
    	{
    		bg.bookDetails();
    		
    	}
    	break;
    	case 5:
    	{
    		exit=false;
    	}
    	break;
    	default:
    	{
    		System.out.println("invalid choice");
    	}
    	}  	
    }
}
}