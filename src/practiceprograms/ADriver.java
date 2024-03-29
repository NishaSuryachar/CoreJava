package practiceprograms;

public class ADriver {

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1(10);
		
		B b=new B();
		b.m1(35,67);

		A a1=new B();
		a1.m1(78);
	}

}
