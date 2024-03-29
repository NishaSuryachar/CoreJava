package JAVAMock;

import java.util.Objects;

public class ToString {

	String name;
	int id;
	ToString(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public int hashcode()
	{
		return Objects.hash(name,id);
	}
	public static void main(String[] args)
	{
		ToString t=new ToString("nisha",1);
		ToString t1=new ToString("nisha",1);
		ToString t2=new ToString("pavi",4);
		System.out.println(t.hashcode());
		System.out.println(t1.hashcode());
		System.out.println(t2.hashcode());
	}

}
