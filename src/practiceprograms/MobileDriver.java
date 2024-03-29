package practiceprograms;

public class MobileDriver {

	public static void main(String[] args) 
	{
		Mobile m=new Mobile("Redmi","4GB",12890.00);
		m.insertSim(new Sim(1234,"Airtel"));
		m.s.getSimNo();
	    m.mobileDetails();
		m.s.simDetails();
		m.removeSim();
		
		
	}

}
