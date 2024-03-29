package nonprimitivetypecasting;

public class Oneplus extends Mobile
{
	double price;
    Oneplus(String brand,String color,String memory,double price)
    {
    	super(brand,color,memory);
    	this.price=price;
    }
    public void OneplusDetails()
    {
    	System.out.println("========ONEPLUS DETAILS========");
    	System.out.println("Brand is "+getBrand());
    	System.out.println("color is "+getColor());
    	System.out.println("memory is "+getMemory());
    	System.out.println("price is "+price);
    }	 
}
