package practiceprograms;

public class OverridingDriver {

	public static void main(String[] args)
	{
		Overriding o=new Overriding();
		o.m1();//hello
		
		Riding r=new Riding();
		r.m1();//hi evng
		
		Overriding ov=new Riding();
		ov.m1();//hello

	    System.out.println(o.a);//10
	    System.out.println(o.b);//20
	    
	    System.out.println(r.a);//100
	    System.out.println(r.b);//200
	    
	    System.out.println(ov.a);//10
	    System.out.println(ov.b);//10
	}

}
