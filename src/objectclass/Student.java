package objectclass;

public class Student 
{
    int id;
    String sname;
    Student(int id,String sname)
    {
    	this.id=id;
    	this.sname=sname;
    }
	public static void main(String[] args)
	{
		Student s1=new Student(12,"Nisha");
		Student s2=new Student(12,"Nisha");
		System.out.println(s1.equals(s2));//its comparing the reference of an object
    }

}
//Here its comparing the reference of an object i want to compare the state(variable) of an object