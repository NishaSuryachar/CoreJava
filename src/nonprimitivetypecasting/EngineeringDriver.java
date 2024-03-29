package nonprimitivetypecasting;

import java.util.Scanner;

public class EngineeringDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		EngineeringCollege e=null;
		boolean exit=true;
		while(true)
		{
			System.out.println("Please Enter The Choice");
            System.out.println("1.SELECTSTREAM\n 2.STREAMDETAILS");
            int choice=sc.nextInt();
            switch(choice)
            {
            case 1:
            {
            	System.out.println("Please Choose The Stream");
                System.out.println("1.COMPUTERSCIENCE\n 2.ELECTRONICSCOMMUNICATION\n 3.MECHANICAL\n 4.EXIT");
                int choice1=sc.nextInt();
                switch(choice1)
                {
                case 1:
                {
                	e=new ComputerScience("U.B.D.T",12,"Davanagere","Data Structure","Design","Technology");
                	System.out.println("Computer Science Selected!!!");
                }
                break;
                case 2:
                {
                	e=new ElectronicsCommunication("U.B.D.T",12,"Davanagere","Electronics","Electricals","Calculus");
                	System.out.println("Electronics and communication selected!!!");
                }
                break;
                case 3:
                {
                	e=new Mechanical("U.B.D.T",12,"Davanagere","Fluid Mechanics","Applied Mechanics","Material Science");
                	System.out.println("Mechanical selected!!!");
                }
                break;
                }
            }
            break;
            case 2:
            {
            	if(e==null)
            	{
            		System.out.println("No stream is Selected");
            	}
            	else if(e instanceof ComputerScience)
            	{
            		ComputerScience c=(ComputerScience)e;
            		c.streamDetails();
            	}
            	else if(e instanceof ElectronicsCommunication)
            	{
            		ElectronicsCommunication ec=(ElectronicsCommunication)e;
            		ec.streamDetails();
            	}
            	else if(e instanceof Mechanical)
            	{
            		Mechanical m=(Mechanical)e;
            		m.streamDetails();
            	}
            	
            }
            break;
            case 3:
            {
            	exit=false;
            }
            break;
            default:
            {
            	System.out.println("Invalid choice");
            }
		}
		
		
	}

}
}