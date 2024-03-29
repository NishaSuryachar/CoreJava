package nonprimitivetypecasting;

public class Ball
{
     private String bname;
     private String radius;
     private String brand;
     Ball(String bname,String radius,String brand)
     {
    	 this.bname=bname;
    	 this.radius=radius;
    	 this.brand=brand;
     }
     public String getBName()
     {
    	 return bname;
     }
     public String getRadius()
     {
    	 return radius;
     }
     public String getBrand()
     {
    	 return brand;
     }
}
