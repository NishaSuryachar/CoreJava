package abstraction;

public class CalDriver {

	public static void main(String[] args) 
	{
		Calculations c=new Operations();
		System.out.println(c.add(10,20));
		System.out.println(c.sub(200,50));
		System.out.println(c.mul(10,20));
		System.out.println(c.div(35,2));
    }
}

