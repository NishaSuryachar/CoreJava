package nonprimitivetypecasting;

import java.util.Scanner;

public class CabDriver {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
        	System.out.println("=====================");
        	System.out.println("press 1 for Mini");
    		System.out.println("press 2 for Micro");
    		System.out.println("press 3 for sedan");
    	    int choice=sc.nextInt();
		   Cab c;
		  switch(choice)
		  {
		   case 1:
		   {
		     c=new Mini();
		     Mini m1=(Mini)c;
		     System.out.println("Mini Selected!!!");
		     m1.MiniDetails();
		   }
	       break;
		   case 2:
	       {
			 c=new Micro();
		     Micro m2=(Micro)c;
		     System.out.println("Micro Selected!!!");
		     m2.MicroDetails();
		   }
	       break;
		   case 3:
	    	{
			c=new Saden();
			Saden s=(Saden)c;
			System.out.println("Saden Selected!!!");
			s.SedanDetails();
		   }
	    	break;
		   case 4:
		   {
			   exit=false;
		   }
		   break;
		   default:
		   {
			   System.out.println("Invalid Choice");
		   }
		}
		
	}

}
}

