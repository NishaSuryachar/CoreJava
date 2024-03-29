package polymorphism;

public class ADriver {

	public static void main(String[] args)
	{
		A a=new A();
		a.display();//45
		
		B b=new B();
		b.display();//35
		
		A a1=new B();
		a1.display();//35 it is non static method when overriding happens there is runtime polymorphism happens
    }

}


//overriding means method with same name and same signature in different classes 
//in non static runtime polymorphism the reference of an child object is placing inside parent reference [nextline continuing]
//object the happens during runtime so here the the value inside the member of child object gets created that is 35
