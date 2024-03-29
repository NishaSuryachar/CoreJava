package has_A_relationship;

public class Earphone
{
    String brand;
    private String color;
    double price;
    Earphone(String brand,String color,double price)
    {
    	this.brand=brand;
    	this.color=color;
    	this.price=price;
    }
    public void setColor(String color)
    {
    	this.color=color;
    }
    public String getColor()
    {
    	return color;
    }
    
  
}
