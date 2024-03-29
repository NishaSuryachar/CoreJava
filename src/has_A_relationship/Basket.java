package has_A_relationship;

import java.util.Scanner;

public class Basket
{
	String basket_color;
	Ball b;
	Basket(String basket_color)
	{
		this.basket_color=basket_color;
	}
	public void addBall(Ball b)
	{
		if(this.b==null)
		{
		    this.b=b;
		    System.out.println("The ball is throwning into Basket successfully");
		}
		else
		{
			System.out.println("The ball is already in the Basket");
		}
	}
	public void removeBall() 
	{
		if(b==null)
		{
			System.out.println("There is No ball to remove");
		}
		else
		{
		    b=null;
			System.out.println("the ball is removed");
		}
	}
	public void updateBallName()
	{
		if(b==null)
		{
            System.out.println("There is no ball to change name");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the ball name you want to update!!!");  
			String new_ball=sc.next();
			b.setBallName(new_ball);
			System.out.println("The ball Name is successfully updated");
		    System.out.println("The updated ball name is "+b.getBallName());
	    }
		
	}
	public void BallDetails()
    {
		if(b==null)
		{
			System.out.println("No ball to show Details");
		}
		else
		{
		System.out.println("*******Ball Details*******");
		System.out.println("Ball Name is "+b.getBallName());
		System.out.println("Ball color is "+b.getBallColor());
		System.out.println("Ball radius is "+b.getBallRadius());
		}
	}
}	
