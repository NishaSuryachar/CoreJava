package nonprimitivetypecasting;

public class Idea extends Sim
{
	   
	   String color;
	  Idea( int sim_no, String network_type,String service_provider,String color)
	  {
		  super(sim_no,network_type,service_provider);
		  this.color=color;
	  }
	  public void IdeaDetails()
	  {
		  System.out.println("========Idea Details=========");
		  System.out.println("sim no is "+sim_no);
		  System.out.println("Network Type is "+network_type);
		  System.out.println("Service Provider is"+service_provider);
		  System.out.println("color is "+color);
	  }
}
