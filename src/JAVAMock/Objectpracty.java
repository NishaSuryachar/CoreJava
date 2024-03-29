package JAVAMock;

import java.util.Objects;

public class Objectpracty {

	int bus_no;
	String dest;
	Objectpracty(int bus_no,String dest)
	{
		this.bus_no=bus_no;
		this.dest=dest;
	}
	public String toString()
	{
		return " bus_no "+bus_no+" dest "+dest;
	}
	public boolean equals(Object o)
	{
		Objectpracty op=(Objectpracty)o;
		return this.bus_no==op.bus_no && this.dest.equals(op.dest);
	}
	public int hashcode()
	{
		return Objects.hash(bus_no,dest);
	}
	public static void main(String[] args)
	{
		Objectpracty o1=new Objectpracty(123,"Bangalore");
		Objectpracty o2=new Objectpracty(123,"Bangalore");
		Objectpracty o3=new Objectpracty(103,"Bellary");
		System.out.println(o1);
		System.out.println(o1.equals(o2));//true
		System.out.println(o1.equals(o3));//false
		System.out.println(o1.hashcode());
		System.out.println(o1.hashcode());
		System.out.println(o3.hashcode());//diff
		

	}

}
