package exceptions;


public class MultipleCatchDemo
{

	public static void main(String[] args) 
	{
		String s="Karthik";
		try
		{
			System.out.println(s.charAt(7));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}

}
//try block can have multiple catch block along that parent type exception should be placed at end [in the middle not allowed]
//if object is not matched to any of exception type then parent exception got executed like in above example 