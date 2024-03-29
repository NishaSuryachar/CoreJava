package objectclass;

public class Book
{
   String bname;
   int bid;
   double price;
   Book(String bname,int bid,double price)
   {
	   this.bname=bname;
	   this.bid=bid;
	   this.price=price;
   }
    public static void main(String[] args)
   {
	   Book b=new Book("Abc",12,20.0);
	   System.out.println(b);//its returning the reference of the object
   }
}

//here its returning the reference of the object in hexadecimal
//classname@hexadecimalnumber