package polymorphism;

public class ShadowDriver {

	public static void main(String[] args)
	{
		MethodShadow m=new MethodShadow();
		m.display();//parent
		
		Shadowing s=new Shadowing();
		s.display();//child
		
		MethodShadow m1=new Shadowing();
		m1.display();//parent
	}

}
