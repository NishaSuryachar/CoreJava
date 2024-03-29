package nonprimitivetypecasting;

public class Samsung extends Mobile
{
	double price;
	 Samsung(String brand,String color,String memory,double price)
    {
    	super(brand,color,memory);
    	this.price=price;
    }
    public void SamsungDetails()
    {
    	System.out.println("========SUMSUNG DETAILS========");
    	System.out.println("Brand is "+getBrand());
    	System.out.println("color is "+getColor());
    	System.out.println("memory is "+getMemory());
    	System.out.println("price is "+price);
    }
}
