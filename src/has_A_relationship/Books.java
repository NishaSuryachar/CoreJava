package has_A_relationship;

public class Books
{
    private String book_name;
    int book_id;
    double price;
    Books(String book_name,int book_id,double price)
    {
    	this.book_name=book_name;
    	this.book_id=book_id;
    	this.price=price;
    }
    public String getBookName()
    {
    	return book_name;
    }
    public void bookDetails()
    {
    	System.out.println();
    	System.out.println("*******Book Details***********");
    	System.out.println(book_name);
    	System.out.println(book_id);
    	System.out.println(price);
    }
}
