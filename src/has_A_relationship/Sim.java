package has_A_relationship;

public class Sim
{
	private int simNo;
	String service_provider;
	Sim(int simNo,String service_provider)
	{
		this.simNo=simNo;
		this.service_provider=service_provider;
	}
	public int getsimNo() 
	{
		return simNo;
	}
	public void simDetails()
	{
		System.out.println();
		System.out.println("*******sim Details*******");
		System.out.println(simNo);
		System.out.println(service_provider);
	}
	
}
