package exceptions;

public class ArrayExceptionExample
{
    public static void main(String[] args)
	{
        String a[]={"Apple","orange","Water Melon","Bannana","grapes"};
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
        	System.out.println("Array Index out of Bounds");
        }

	}

}
