package has_A_relationship;
import java.util.Scanner;

public class Mobiles
{
	String brand;
    String color;
    double price;
    Earphone e;
    Mobiles(String brand,String color,double price)
    {
    	this.brand=brand;
    	this.color=color;
    	this.price=price;
    }
    public void addEarPhone(Earphone e)
    {
    	if(this.e==null)
    	{
    		this.e=e;
    		System.out.println("The earphones added Successfully");
    	}
    	else
    	{
    	 	System.out.println("Earphones are already present ");
    	}
    }
    public void removeEarphone()
    {
    	if(e==null)
    	{
    		System.out.println("There is no Earphones To Remove");
    	}
    	else
    	{
    		e=null;
    		System.out.println("Earphone successfully Removed");
    	}
    }
    public void updateEarphones()
    {
    	if(e==null)
    	{
    		System.out.println("There is no earphones to update the color");
    	}
    	else
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the color You Want to update");
    		String new_color=sc.next();
    		e.setColor(new_color);
    		System.out.println("The color is UPdated successfully");
    		System.out.println("The updated color is "+new_color);
    	}
    }
    public void earPhoneDetails()
    {
    	if(e==null)
    	{
    		System.out.println("There is no earphones to show the details");
    	}
    	else
    	{
    		System.out.println("=============The mobile Details============ ");
    		System.out.println("Mobile brand is "+e.getColor());
    		System.out.println("mobile brand is "+e.brand);
        	System.out.println("The mobile price is "+price);
        }
     }
}

