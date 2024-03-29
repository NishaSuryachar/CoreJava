package has_A_relationship;

public class Book1 
{
   private String book_name;//r/w
   private int book_id;//r
   private double book_price;//r
   Book1(String book_name,int book_id,double book_price)
   {
	   this.book_name=book_name;
	   this.book_id=book_id;
	   this.book_price=book_price;
   }
   public String getBookName()
   {
	    return book_name;   
   }
   public void setBookName(String book_name)
   {
	   this.book_name=book_name;
   }
   public int getBook_id()
   {
	   return book_id;
   }
   public double getBookPrice() 
   {
	   return book_price;
   }
}
