package practiceprograms;

import java.util.Scanner;

public class VehicleDriver
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Vehicle v=null;
		boolean exit=true;
		while(exit)
		{
		System.out.println("enter the choice");
		System.out.println("1.vehicle\n 2.vehicledetails\n 3.exit");
		int choice1=sc.nextInt();
		switch(choice1)
		{
		
		case 1:
		{
		System.out.println("Enter the choice");
		System.out.println("1.car\n 2.bike");
		int choice=sc.nextInt();
		switch(choice)
		{
		           case 1:
				   {
                       v=new Car(4,12,56779.00,4);
					   System.out.println("car selected");
				   }
				   break;
				   case 2:
				   {
					   v=new Bike(2,46,75000);
					   System.out.println("Bike selected");
				   }
				   break;
		}
		}
		   break;
		    case 2:
		    {
		    	if(v==null)
		    	{
		    		System.out.println("no vehicle to show");
		    	}
		    	else if(v instanceof Car)
		    	{
		    		Car c=(Car)v;
		    		c.CarDetails();
		    	}
		    	else if(v instanceof Bike)
		    	{
		    		Bike b=(Bike)v;
		    		b.BikeDetails();
		    	}
		    	 
		    }
		    break;
		    case 3:
		    {
		    	exit=false;
		    }
		    default:
		    {
		    	System.out.println("invalid choice");
		    }
		}
	}
		
	}
}
