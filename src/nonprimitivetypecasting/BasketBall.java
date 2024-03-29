package nonprimitivetypecasting;

public class BasketBall extends Ball
{
    double price;
    BasketBall(String bname,String radius,String brand,double price)
    {
    	super(bname,radius,brand);
    	this.price=price;
    }
    public void BasketBallDetails()
    {

    	System.out.println("=======BASKETBALL DETAILS=======");
    	System.out.println("Ball Name is "+getBName());
    	System.out.println("Ball Radius is "+getRadius());
    	System.out.println("Ball Brand is "+getBrand());
    	System.out.println("Ball price is "+price);
    }
}
