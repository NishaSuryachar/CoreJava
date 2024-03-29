package filehandling;

public class Boxing {

	public static void main(String[] args)
	{
		int i=10;
		Integer i1=Integer.valueOf(i);
		System.out.println(i1);

		byte b=50;
		Byte b1=Byte.valueOf(b);
		System.out.println(b1);
		
		short s=25;
		Short s1=Short.valueOf(s);
		System.out.println(s1);
		
		long l=23456;
		Long l1=Long.valueOf(l);
		System.out.println(l1);
		
		float f=45.7f;
		Float f1=Float.valueOf(f);
		System.out.println(f1);
		
		double d=3.5;
		Double d1=Double.valueOf(d);
		System.out.println(d1);
		
		char c='a';
	    Character c1=Character.valueOf(c);
	    System.out.println(c1);
	    
	    boolean boo=false;
	    Boolean boo1=Boolean.valueOf(boo);
	    System.out.println(boo1);
	}

}
