package Constructor;

public class ConstructorChaining
{
	String name;
	int id;
	double salary;
	ConstructorChaining(String name)
	{
		this.name=name;
	}
	ConstructorChaining(String name,int id)
	{
		this(name);
		this.id=id;
	}
	ConstructorChaining(String name,int id,double salary)
	{
		this(name,id);
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	public static void main(String[] args) 
	{
		ConstructorChaining c=new ConstructorChaining("nisha",1,30000);
		c.display();

	}

}
