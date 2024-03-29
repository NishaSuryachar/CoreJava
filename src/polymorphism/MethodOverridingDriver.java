package polymorphism;

public class MethodOverridingDriver {

	public static void main(String[] args) 
	{
		Methodoverriding m=new Methodoverriding();
		m.display();
		
		Riding r=new Riding();
		r.display();
		
		Methodoverriding m1=new Riding();
		m1.display();
	}

}
