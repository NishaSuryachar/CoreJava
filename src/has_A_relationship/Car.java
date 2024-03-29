package has_A_relationship;

public class Car 
{
    String model;
    String color;
    double price;
    Engine e;
    Car( String model,String color,double price,Engine e)
    {
    	this.model=model;
    	this.color=color;
    	this.price=price;
    	this.e=e;		
    }
    public void carDetails() 
    {
    	 System.out.println("=====car Details=====");
    	System.out.println("car model "+model);
    	System.out.println("car color "+color);
    	System.out.println("car price "+price);
    	System.out.println(e.getEngine_no());
    	System.out.println(e.getCc());
    }
    
}
