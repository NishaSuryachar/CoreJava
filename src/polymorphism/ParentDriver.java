package polymorphism;

public class ParentDriver {

	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.m1();//parent
		
		Child c=new Child();
		c.m1();//child
		
		Parent p1=new Child();//upcasting
		p1.m1();//parent it is  static method when overriding happens there is compiletime polymorphism happens
	}

}
//overriding means method with same name and same signature in different classes 
//in static runtime polymorphism the reference of an child object is placing inside parent reference [nextline continuing]
//object the happens during compiletime so here the the value inside the member of parent object gets created that is
//[from parent class]
