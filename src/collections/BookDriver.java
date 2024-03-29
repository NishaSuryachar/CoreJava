package collections;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) 
	{
       Bag b1=new Bag();
       Scanner sc=new Scanner(System.in);
       boolean exit=true;
       while(exit)
       {
       System.out.println("Enter Your Choice");
       System.out.println("1.AddBook\n 2.RemoveBook\n 3.BookDetails\n 4.UpdateBookName\n 5.Exit");
       int choice=sc.nextInt();
       switch(choice)
       {
       case 1:
       {
    	   b1.addBook();
    	   
       }
       break;
       case 2:
       {
    	   System.out.println("Enter the Book Name You want to remove");
    	   String bname=sc.next();
    	    b1.removeBook(bname);
       }
       break;
       case 3:
       {
    	   System.out.println("Enter the Book Name to see the details");
    	   String bname=sc.next();
    	    b1.bookDetails(bname);
       }
       break;
       case 4:
       {
    	   System.out.println("Enter the Book Name You want to update");
    	   String bname=sc.next();
    	   b1.UpdateBookName(bname);
       }
       break;
       case 5:
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
