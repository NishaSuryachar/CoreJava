package is_A_relationship;

public class DoctorDriver {

	public static void main(String[] args)
	{
		Doctor d=new Doctor();
		d.checkBP();
		d.checkPulse();
		System.out.println("The doctor name is "+d.name);
		System.out.println("The doctor dlno is "+d.dlno);
		Cardiologist c=new Cardiologist();
		c.checkPulse();
		c.checkBP();
		c.byPass();
		System.out.println("The doctor name is "+c.name);
		System.out.println("The doctor dlno is "+c.dlno);
		System.out.println("The doctor name is "+c.name);
	}
}
