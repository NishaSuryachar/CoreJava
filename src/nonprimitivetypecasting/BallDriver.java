package nonprimitivetypecasting;

import java.util.Scanner;

public class BallDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Ball b=null;
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice");
            System.out.println(" 1.SELECTBALL\n 2.BALLDETAILS");
            int choice=sc.nextInt();
            switch(choice)
            {
            case 1:
            {
            	System.out.println("Enter Ball Type");
            	System.out.println(" 1.FOOTBALL\n 2.TENNISBALL\n 3.BASKETBALL");
            	int choice1=sc.nextInt();
            	switch(choice1)
            	{
            	case 1:
            	{
            		b=new FootBall("FOOTBALL","6CM","PUMA",500);
            		System.out.println("FootBall is selected!!!");
            	}
            	break;
            	case 2:
            	{
            		b=new TennisBall("TENNISBALL","2CM","COSCO",200);
            		System.out.println("TennisBall is selected!!!");
            	}
            	break;
            	case 3:
            	{
            		b=new BasketBall("BASKETBALL","8CM","Wilson",500);
            		System.out.println("BasketBall is selected!!!");
            	}
            	break;
                }
            }
            break;
            case 2:
            {
            	if(b==null)
            	{
            		System.out.println("No Ball is Selected!!!");
            	}
            	else if(b instanceof FootBall)
            	{
            		FootBall f=(FootBall)b;
            		f.FootBallDetails();
            	}
            	else if(b instanceof TennisBall)
            	{
            		TennisBall t=(TennisBall)b;
                	t.TennisBallDetails();
            	}
            	else if(b instanceof BasketBall)
            	{
            		BasketBall b1=(BasketBall)b;
                	b1.BasketBallDetails();
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
            	System.out.println("Invalid Choice");
            }
            }
        }
	}

}
