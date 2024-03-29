package abstraction;

public class DemoDriver {

	public static void main(String[] args) 
	{
		//Demo d=new Demo(); we cannot create a object for interface same like abstract class 
		Demo d=new Child1();//we can create a object for child class of parent type
		d.m1();//calling method from child class [method overriding] run time polymorphism established
		d.m2();
		Demo.m3();//static method can be declared in interface with body but it cannot inherited from subclass we can access the static 
		//          method by using interface name
	}

}
