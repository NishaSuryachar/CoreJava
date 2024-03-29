package polymorphism;

public class MethodOverloading
{
    public void display()
    {
    	
    }
    public void display(String name)
    {
    	System.out.println("Name is "+name);
    }
    public void display(int a,float b)
    {
    	System.out.println(a);
    	System.out.println(b);
    }
    public void display(int a,int b)
    {
    	System.out.println(a);
    	System.out.println(b);
    }
}
