package exceptions;

public class ArithematicExceptionDemo {

	public static void main(String[] args)
	{
		try 
		{
	    System.out.println("good mrng");		
		int a=10/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot Divide by 0");
		}
	}		

}
