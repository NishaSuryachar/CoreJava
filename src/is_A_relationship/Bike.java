package is_A_relationship;

public class Bike extends Vehicle
{
	Bike(int no_of_wheels,double price,int engine_no)
	{
		super(no_of_wheels,price,engine_no);
	}
	public void BikeDetails()
	{
		System.out.println("=======The Bike=======");
		System.out.println("The no of wheels for the Bike is "+no_of_wheels);
		System.out.println("The price of the bike is "+price);
		System.out.println("The engine no of the bike is "+engine_no);
	}
}
