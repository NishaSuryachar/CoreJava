package has_A_relationship;

import java.util.Scanner;

public class Bags
{
	String bagName;
	Book1 b;
	Bags(String bagName)
	{
		this.bagName=bagName;
	}
	public void addBook(Book1 b)
	{
		if(this.b==null)
		{
			
			this.b=b;
			System.out.println("Book is inserted successfully!!!");
		}
		else
		{
			System.out.println("Books already present");
		}
	}
	public void removeBook()
	{
		if(b==null)
		{
			System.out.println("there are No books to remove");
		}
		else
		{
			b=null;
			System.out.println("Books are successfully removed");
		}
	}
	public void updateBookName()
	{
		if(b==null)
		{
			System.out.println("There are No Books To update the name");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Book Name to update");
			String new_name=sc.next();
			b.setBookName(new_name);
			System.out.println("The Book Name is updated successfully");
			System.out.println("The updated name is "+b.getBookName());
		    
		}
	}
	public void displayBookDetails()
	{
		if(b==null)
		{
			System.out.println("There is No books to Show Details");
		}
		else
		{
			System.out.println("********Books Details**********");
			System.out.println("The Book Name is "+b.getBookName());
			System.out.println("The Book_id is "+b.getBook_id());
			System.out.println("The Book_price is "+b.getBookPrice());
		}
	}
	

}
