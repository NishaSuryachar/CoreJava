package practiceprograms;

public class Mobile
{
    String brand;
    String ram;
    double price;
    Sim s;
    Mobile(String brand,String ram,double price)
    {
    	this.brand=brand;
    	this.ram=ram;
    	this.price=price;
    }
    public void insertSim(Sim s)
    {
        this.s=s;
    }
    public void removeSim()
    {
    	s=null;
    }
    public void mobileDetails()
    {
    	System.out.println("===mobile DEtails===");
    	System.out.println(brand);
    	System.out.println(ram);
    	System.out.println(price);
    	System.out.println(s.getSimNo());
    }
}
