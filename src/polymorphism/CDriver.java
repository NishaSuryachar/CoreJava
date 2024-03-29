package polymorphism;

public class CDriver {

	public static void main(String[] args) 
	{
		C c=new C();
		System.out.println(c.getAge());//34
		
		D d=new D();
		System.out.println(d.getAge());//4
		
		C c1=new D();//upcasting
		System.out.println(c1.getAge());//34
	}

}
 //variable shading : same variable name in both parent and child class with static or non-static 
//there is no concept of runtime polymorphism

//so here c1.age prints 34 only