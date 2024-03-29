package practiceprograms;

public class Book 
{
   String bname;
   int bid;
   double price;
   String author;
   Page p;
   Book(String bname,int bid,double price,String author,Page p)
   {
	   this.bname=bname;
	   this.bid=bid;
	   this.price=price;
	   this.author=author;
	   this.p=p;
   }
   public void bookDetails()
   {
	   System.out.println("===book details=====");
	   System.out.println(bname);
	   System.out.println(bid);
	   System.out.println(price);
	   System.out.println(author);
   }
   
}
