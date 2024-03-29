package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Bag
{
   LinkedList<Book> bag=new LinkedList();
   Scanner sc=new Scanner(System.in);
   public void addBook()
   {
	   System.out.println("Enter the book Name you want add");
	   String bname=sc.next();
	   System.out.println("Enter the Book Id");
	   int bid=sc.nextInt();
	   System.out.println("Enter the Book Price");
	   double price=sc.nextDouble();
	   bag.add(new Book(bname,bid,price));
	   System.out.println("Book added successfully");
   }
   public void removeBook(String bname)
   {
	   if(bag.size()==0)
	   {
		   System.out.println("Book doesn't exist");
		   return;
	   }
	   for(Book b:bag)
	   {
		   if(b.bname.equals(bname))
		   { 
		   bag.remove(b);
		   System.out.println("Book successfully Removed");
		   return;
	       }
	   }
	   System.out.println("Book doesn't exist in the bag");
 }
   public void bookDetails(String bname)
   {
	   if(bag.size()==0)
	   {
		   System.out.println("Book doesn't exist");
		   return;
	   }
	   for(Book b:bag)
	   {
		   if(b.bname.equals(bname))
		   {
			   System.out.println("=====Book Details Are========");
			   System.out.println("Book Name "+b.bname);
			   System.out.println("Book Id "+b.bid);
			   System.out.println("Book Price "+b.price);
			   return;
		   }
	   }
		   System.out.println("Book doesn't exist in the bag");
    }
   public void UpdateBookName(String bname)
   {
	   if(bag.size()==0)
	   {
		   System.out.println("Book doesn't exist");
		   return;
	   }
	   for(Book b:bag)
	   {
		   if(b.bname.equals(bname))
		   {
			   System.out.println("Enter the new book name to update");
	    	   String new_bname=sc.next();
	    	   b.bname=new_bname;
			   System.out.println("Book Name successfully Updated");
			   System.out.println("updated Book Name is "+b.bname);
			   return;
		   }
	   }
	   System.out.println("Book doesn't exist in the bag");
   }
   
}
