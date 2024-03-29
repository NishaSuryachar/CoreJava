package nonprimitivetypecasting;

public class Driver1 {

	public static void main(String[] args) 
	{
		A a=new D();
		B b=(B)a;
		C c=(C)a;
		D d=(D)a;
		
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		System.out.println(a instanceof A);
		
		A a1=new C();//upcast
		B b1=(B)a1;
		C c1=(C)a1;//downcast
	//	D d1=(D)a1;class cast Exception we can't access the class D member because we didnit upcasted the class D 
		//so without upcasting we can't do downcasting
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
	}

}
