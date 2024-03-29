package abstraction;

public class BikeDriver {

	public static void main(String[] args)
	{
		Bike b=new Honda();//we can't create a object for abstract class but we can create a object for child class of parent type 
		b.run();
		
	    System.out.println("==============");
	    Bike b1=new Pulsar();
	    b1.run();
	}

}
//parent - bike ,child -honda and pulsar