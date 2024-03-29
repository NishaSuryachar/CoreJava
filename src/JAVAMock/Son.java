package JAVAMock;

public class Son extends Father
{
	String name="Arjun";
	   int age=27;
	   public void sonDetails()
	   {
		   System.out.println(name);
		   System.out.println(age);
		   System.out.println(super.name);
		   System.out.println(super.age);
	   }
}
