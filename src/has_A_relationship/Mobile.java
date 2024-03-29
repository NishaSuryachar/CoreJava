package has_A_relationship;

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
    	this.s=null;
    }
    public void MobileDetails()
    {
    	System.out.println("*********Mobile Details*********");
    	System.out.println(brand);
    	System.out.println(ram);
    	System.out.println(price);
    	System.out.println(s.getsimNo());
    	System.out.println();
    }
}
