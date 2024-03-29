package practiceprograms;

public class Boo
{
     private String book_name;//r//w
     private int book_id;//r
     private double book_price;//r
     Boo(String book_name,int book_id,double book_price)
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
     public int getBookId()
     {
    	 return book_id;
     }
     public double getBookPrice()
     {
    	 return book_price;
     }
     public void BookDetails()
     {
    	 System.out.println("===book details===");
    	 System.out.println(book_name);
    	 System.out.println(book_id);
    	 System.out.println(book_price);
     }
}
