package practiceprograms;

public class Sim
{
     private int sim_no; 
     String sim_provider;
     Sim(int sim_no,String sim_provider)
     {
    	this.sim_no=sim_no;
    	this.sim_provider=sim_provider;
     }
     public int getSimNo()
     {
    	 return sim_no;
     }
    
     public void simDetails()
     {
    	 System.out.println("===sim detail===s");
    	 System.out.println(sim_no);
    	 System.out.println(sim_provider);
     }
}
