package JAVAMock;

public class ConstructorChaining {

	String name;
	int age;
	String height;
	String weight;
	ConstructorChaining(String name)
	{
		this.name=name;
	}
	ConstructorChaining(String name,int age)
	{
		this(name);
		this.age=age;
	}
	ConstructorChaining(String name,int age,String height)
	{
		this(name,age);
		this.height=height;
	}
	ConstructorChaining(String name,int age,String height,String weight)
	{
		this(name,age,height);
		this.weight=weight;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		
	}
	public static void main(String[] args)
	
	{
		ConstructorChaining c=new ConstructorChaining("Ram",25,"6feet","50kg");
		c.display();
	}

}
