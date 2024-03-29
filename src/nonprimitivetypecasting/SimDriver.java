package nonprimitivetypecasting;

import java.util.Scanner;


public class SimDriver
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Sim s=null;
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your option");
			System.out.println("1.SelectSim\n 2.SimDetails\n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("please Enter choice");
				System.out.println("1.Airtel\n 2.Idea");
				int choice1=sc.nextInt();
				switch(choice1)
				{
				case 1:
				{
					s=new Airtel(1234,"4G","Airtel","Red");
					System.out.println("Airtel Selected");
				}
				break;
				case 2:
				{
					s=new Idea(5678,"3G","Idea","Yellow");
					System.out.println("Idea Selected");
				}
				break;
				}
			}
				break;
			    case 2:
				{
					if(s==null)
					{
						System.out.println("No sim choosen");
					}
					else if(s instanceof Airtel)
					{
						Airtel a=(Airtel)s;
						a.AirtelDetails();
					}
					else if(s instanceof Idea)
					{
						Idea i=(Idea)s;
						i.IdeaDetails();
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
