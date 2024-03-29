package practiceprograms;

import java.util.Scanner;

public class Bag 
{
	Scanner sc=new Scanner(System.in);
    String bag_name;
    Boo bk;
    Bag(String bag_name)
    {
    	this.bag_name=bag_name;
    }
    public void addBook(Boo bk)
    {
    	
    	this.bk=bk;
    	System.out.println("book inserted successfully");
    }
    public void removeBook()
    {
    	if(bk!=null)
    	{
    		bk=null;
    	    System.out.println("book removed successfully");
    	}
    	else
    	{
    		System.out.println("no books remove");
    	}
    }
    public void updateBookName()
    {
    	if(bk!=null)
    	{
    	System.out.println("Enter the new book name you want to update");
    	String new_bkname=sc.next();
    	bk.setBookName(new_bkname);
    	System.out.println("book name update successfully");
    	System.out.println("new book name is "+bk.getBookName());
        }
    	else
    	{
    		System.out.println("no books");
    	}
    }
    public void bookDetails()
    {
    	if(bk!=null)
    	{
    		System.out.println("=====Book details====");
    	    System.out.println(bk.getBookId());
           	System.out.println(bk.getBookName());
         	System.out.println(bk.getBookPrice());
         }
    	else
    	{
    		System.out.println("no books to show details");
    	}
    }
}
