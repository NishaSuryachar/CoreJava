package abstraction;

public class InterfaceDriver {

	public static void main(String[] args)
	{
		I1 i=new Subclass();
		i.m1();// subclass m1() body given to interface1 
		
		I2 i1=new Subclass();
		i1.m1();// subclass m1() body given to interface2

	}

}
//here we acheive the multiple inheritance 2 parent 1 child and also we solve diamond problem 
//  body of a subclass which is given to which interface that will be called