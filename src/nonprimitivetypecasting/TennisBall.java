package nonprimitivetypecasting;

public class TennisBall extends Ball
{
    double price;
    TennisBall(String bname,String radius,String brand,double price)
    {
    	super(bname,radius,brand);
    	this.price=price;
    }
    public void TennisBallDetails()
    {

    	System.out.println("=======TENNISBALL DETAILS=======");
    	System.out.println("Ball Name is "+getBName());
    	System.out.println("Ball Radius is "+getRadius());
    	System.out.println("Ball Brand is "+getBrand());
    	System.out.println("Ball price is "+price);
    }

}
