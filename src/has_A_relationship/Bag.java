package has_A_relationship;

public class Bag 
{
    String color;
    double bag_price;
    Books b1;
    Bag(String color, double bag_price)
    {
    	this.color=color;
    	this.bag_price=bag_price;
    }
    public void addBook(Books b1)
    {
    	this.b1=b1;
    }
    public void removeBook()
    {
    	this.b1=null;
    }
    public void bagDetails()
    {
    	System.out.println("******Bag Details*******");
    	System.out.println(color);
    	System.out.println(bag_price);
    	System.out.println();
    }
}
