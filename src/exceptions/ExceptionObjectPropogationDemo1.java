package exceptions;

public class ExceptionObjectPropogationDemo1
{
	public static void greet(String s)
	{
		System.out.println(s);
		welcome(null);
	}
	public static void welcome(String str)
	{
		str.equals("Welcome");
	}
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		try 
		{
		greet("Nisha");
	    }
		catch(Exception e)
		{
			System.out.println("Exception Handled by Caller");
		}
		System.out.println("Main Ends");
	}
}
