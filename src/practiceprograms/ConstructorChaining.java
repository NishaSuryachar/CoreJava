package practiceprograms;

public class ConstructorChaining
{
	String name;
	int age;
	String height;
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
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	public static void main(String[] args)
	{
		ConstructorChaining c=new ConstructorChaining("nisha",25,"5feet");
		c.display();
    }

}
