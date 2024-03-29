package nonprimitivetypecasting;

public class Driver {

	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.name);
		System.out.println(p.age);
		p.ParentDetails();
		
		
		child c=new child();
		System.out.println(c.name);
		System.out.println(c.age);
		c.ChildDetails();
		c.ParentDetails();
		
	    Parent p1=new child();
	    child c1=(child)p1;
	    p1.ParentDetails();
	    
	 }

}
