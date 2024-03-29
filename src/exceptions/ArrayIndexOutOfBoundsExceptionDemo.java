package exceptions;

public class ArrayIndexOutOfBoundsExceptionDemo
{
    public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		try
		{
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" ArrayIndex is out of Bounds");
		}

	}

}
