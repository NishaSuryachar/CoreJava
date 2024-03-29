package exceptions;

public class NullPointerExample {

	public static void main(String[] args)
	{
		String s="Mango";
		String n=null;
		try 
		{
		n.equals(s);
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot compare with Null");
		}
		System.out.println(s);
		System.out.println(n);
	}

}





