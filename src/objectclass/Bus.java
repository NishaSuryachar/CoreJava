package objectclass;
 
import java.util.Objects;

public class Bus
{
    int bus_no;
    String dest;
    Bus(int bus_no,String dest)
    {
    	this.bus_no=bus_no;
    	this.dest=dest;
    }
    public String toString()
    {
    	return " Bus = "+bus_no+" Destinatin = "+dest;
    }
    public boolean equals(Object o)
    {
    	Bus b=(Bus)o;
    	return this.bus_no==b.bus_no && this.dest.equals(b.dest);
    }
    public int hashcode()
    {
    	return Objects.hash(bus_no,dest);
    }
	public static void main(String[] args)
	{
		Bus b1=new Bus(12,"Delhi");
		System.out.println(b1);
		Bus b3=new Bus(13,"Mysore");
		Bus b4=new Bus(13,"Mysore");
		Bus b2=new Bus(8,"DVG");
		Bus b5=new Bus(8,"DVG");
		
		System.out.println(b3.equals(b4));
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		System.out.println(b2.hashcode()==b5.hashcode());
		System.out.println(b1.hashcode()==b4.hashCode());
		System.out.println(b3.hashcode()==b4.hashcode());
		
	}

}
