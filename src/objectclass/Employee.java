package objectclass;

import java.util.Objects;

public class Employee 
{
    int id;
    String ename;
    Employee(int id,String ename)
    {
    	this.id=id;
    	this.ename=ename;
    }
  
	public static void main(String[] args)
	{
		Employee e1=new Employee(12,"karthi");
		Employee e2=new Employee(12,"karthi");
        System.out.println(e1.hashCode());//hascode generates the unique code for reference of an object
        System.out.println(e2.hashCode());//hascode generates the unique code for reference of an object
        
	}

}
