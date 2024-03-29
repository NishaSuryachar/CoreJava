package exceptions;

public class StringIndexOutOfBoundsExceptionDemo
{

	public static void main(String[] args)
	{
		String s="Nisha Suryachar";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(9));
		System.out.println(s.charAt(10));
		System.out.println(s.charAt(11));
		System.out.println(s.charAt(12));
		System.out.println(s.charAt(13));
		System.out.println(s.charAt(14));
		try
		{
		System.out.println(s.charAt(15));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index out of bounds");
		}

	}

}
