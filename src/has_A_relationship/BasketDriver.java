package has_A_relationship;

import java.util.Scanner; 

public class BasketDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basket Color");
		String basket_color=sc.next();
		Basket b1=new Basket(basket_color);
		boolean exit=true;
		while(exit)
		{
		System.out.println("1.ADDBALL\n 2.REMOVEBALL\n 3.UPDATEBALL\n 4.DISPLAYBALLDETAILS");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
		       System.out.println("Enter Ball name");
		       String ball_name=sc.next();
		       System.out.println("Enter Ball Color");
		       String ball_color=sc.next();
		       System.out.println("Enter Ball Radius");
		       String ball_radius=sc.next();
			   b1.addBall(new Ball(ball_name,ball_color,ball_radius));
		}
		break;
		case 2:
		{
			  b1.removeBall();
		}
		break;
		case 3:
		{
			
			b1.updateBallName();
		}
		break;
		case 4:
		{
			b1.BallDetails();
		}
		break;
		case 5:
		{
			exit=false;
		}
		}
	}
}
}
		
	    
		
	

