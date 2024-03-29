package abstraction;

public class BankDriver {

	public static void main(String[] args)
	{
		Bank b=new SBI();
		System.out.println(b.getRateOfInterest());
	
		
		System.out.println("=============");
		Bank b1=new RBI();
		System.out.println(b1.getRateOfInterest());
	}

}
