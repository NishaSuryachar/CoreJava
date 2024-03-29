package exceptions;

public class StringExceptionExample 
{

	public static void main(String[] args) 
	{
		String s="Apple is good for Health";
		System.out.println(s.length());
		System.out.println(s.charAt(18));
		System.out.println(s.charAt(19));
		System.out.println(s.charAt(20));
		System.out.println(s.charAt(21));
		System.out.println(s.charAt(22));
		System.out.println(s.charAt(23));
		try 
		{
        System.out.println(s.charAt(26));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index out of Bounds");
		}
	}
}
