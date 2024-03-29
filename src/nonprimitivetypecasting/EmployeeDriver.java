package nonprimitivetypecasting;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   Employee e=null;
	   boolean exit=true;
	   while(exit)
	   {
		   System.out.println("Please Enter Your Choice");
	       System.out.println("1.selectEmployee\n 2.EmployeeDetails\n 3.Exit");
	       int choice=sc.nextInt();
	       switch(choice)
	       {
	       case 1:
	       {
	    	   System.out.println("Please Enter Your Choice");
	           System.out.println("1.ContractEmployee\n 2.PermanentEmployee");
	           int choice1=sc.nextInt();
	           switch(choice1)
	           {
	           case 1:
	           {
	        	   e=new ContractEmployee(12,"seema",25,"Nakri");
	        	   System.out.println("Contract Employee is selected");
	           }
	           break;
	           case 2:
	           {
	        	   e=new PermanentEmployee(13,"Adya",24,"TCS");
	        	   System.out.println("Permanent Employee is selected");
	           }
	           break;
	           }
	       }
	       break;
	       case 2:
	       {
	    	   if(e==null)
	    	   {
	    		   System.out.println("There is No Employee To show The Details");
	    	   }
	    	   else if(e instanceof ContractEmployee)
	    	   {
	    		   ContractEmployee c=(ContractEmployee)e;
	    		   c.ContractEmployeeDetails();
	    	   }
	    	   else if(e instanceof PermanentEmployee)
	    	   {
	    		   PermanentEmployee p=(PermanentEmployee)e;
	    		   p.PermanentEmployeeDetails();
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
