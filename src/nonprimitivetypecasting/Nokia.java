package nonprimitivetypecasting;

public class Nokia extends Mobile
{
    double price;
    Nokia(String brand,String color,String memory,double price)
    {
    	super(brand,color,memory);
    	this.price=price;
    }
    public void NokiaDetails()
    {
    	System.out.println("========NOKIA DETAILS========");
    	System.out.println("Brand is "+getBrand());
    	System.out.println("color is "+getColor());
    	System.out.println("memory is "+getMemory());
    	System.out.println("price is "+price);
    }
}


