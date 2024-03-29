package polymorphism;

public class MethodDriver {

	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.display();
		m.display("karthik");
		m.display(10,20.4f);
		m.display(2,5);
	}

}
