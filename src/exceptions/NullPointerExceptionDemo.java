package exceptions;

public class NullPointerExceptionDemo
{

	public static void main(String[] args)
	{
		String a="karthik";
		String s=null;
		try 
		{
	        s.equals(a);
		}
		catch(NullPointerException e)
		{
		  System.out.println("cannot compare with null");
		}
		System.out.println(a); 
		System.out.println(s); 
	}

}
