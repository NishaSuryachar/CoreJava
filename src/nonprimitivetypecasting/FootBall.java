package nonprimitivetypecasting;

public class FootBall extends Ball
{
    double price;
    FootBall(String bname,String radius,String brand,double price)
    {
    	super(bname,radius,brand);
    	this.price=price;
    }
    public void FootBallDetails()
    {

    	System.out.println("=======FOOTBALL DETAILS=======");
    	System.out.println("Ball Name is "+getBName());
    	System.out.println("Ball Radius is "+getRadius());
    	System.out.println("Ball Brand is "+getBrand());
    	System.out.println("Ball price is "+price);
    }
}
