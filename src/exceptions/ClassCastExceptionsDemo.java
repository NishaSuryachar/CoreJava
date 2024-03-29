package exceptions;

public class ClassCastExceptionsDemo
{

	public static void main(String[] args) 
	{
		A a=new B();
		B b=(B)a;
		try
		{
        C c=(C)a;
		}
		catch(ClassCastException e)
		{
			System.out.println("we cannot convert the reference to a specific class and the object doesn’t have an instance of that type");
		}
    }

}
