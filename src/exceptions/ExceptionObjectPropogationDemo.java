package exceptions;

public class ExceptionObjectPropogationDemo
{
    public static void m1(int a,int b)
    {
    	int c=a/b;
    }
	public static void main(String[] args)
	{
		try
		{
		m1(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled by Caller Method");
		}

	}

}