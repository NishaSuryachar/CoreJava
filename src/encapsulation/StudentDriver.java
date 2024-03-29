package encapsulation;

public class StudentDriver 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1.getName());
		s1.setName("seema");
		System.out.println(s1.getSid());
	    s1.setAge(23);
	}

}
