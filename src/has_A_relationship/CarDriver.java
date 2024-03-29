package has_A_relationship;

public class CarDriver {

	public static void main(String[] args)
	{
		Car c=new Car("Alto","royal blue",525897.90,new Engine(456,78));
		c.carDetails();
		c.e.engineDetails();
		System.out.println();
		System.out.println("The engine no is "+c.e.getEngine_no());
		System.out.println("The cc is "+c.e.getCc());
	}

}
