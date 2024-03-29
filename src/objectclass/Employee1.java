package objectclass;

import java.util.Objects;

public class Employee1
{
	    int id;
	    String ename;
	    Employee1(int id,String ename)
	    {
	    	this.id=id;
	    	this.ename=ename;
	    }
	    public int hashcode()
	    {
	    	return Objects.hash(id,ename);
	    }
	public static void main(String[] args) 
	{
		Employee1 e3=new Employee1(15,"Nisha");
		Employee1 e4=new Employee1(15,"Nisha");
		Employee1 e1=new Employee1(10,"Ammu");
        System.out.println(e3.hashCode());//hascode generates for the state(variable) of an object
        System.out.println(e4.hashCode());//hascode generates for the state(variable) of an object
        System.out.println(e1.hashCode());
        System.out.println(e3.hashcode()==e4.hashcode()); 
        System.out.println(e1.hashcode()==e3.hashcode());
    
	}

}
