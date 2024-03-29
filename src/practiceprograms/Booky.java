package practiceprograms;

public class Booky
{
    private String bname;
    int bid;
    double price;
    Booky(String bname,int bid,double price)
    {
    	this.bname=bname;
    	this.bid=bid;
    	this.price=price;
    }
    public String getBname()
    {
    	return bname;
    }
    public void bookDetails()
    {
    	System.out.println("==book details====");
    	System.out.println(bname);
    	System.out.println(bid);
    	System.out.println(price);
    }
}
