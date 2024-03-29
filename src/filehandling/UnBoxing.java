package filehandling;

public class UnBoxing 
{
   public static void main(String[] args) 
   {
		Integer i=10;
		int i1=i.intValue();
		System.out.println(i1);
		
	    Byte b=12;
		byte b1=b.byteValue();
		System.out.println(b1);
		
		Short s=267;
		Short s1=s.shortValue();
		System.out.println(s1);
		
		Long l=567L;
		long l1=l.longValue();
		System.out.println(l1);
		
		Float f=23.7f;
		float f1=f.floatValue();
		System.out.println(f1);
		
		Double d=24.8;
		double d1=d.doubleValue();
		System.out.println(d1);
		
		Character c='A';
		char c1=c.charValue();
		System.out.println(c1);
		
		Boolean boo=true;
		boolean boo1=boo.booleanValue();
		System.out.println(boo1);
		
		}

}


