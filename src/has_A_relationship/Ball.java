package has_A_relationship;

public class Ball
{
   private String ball_name;//r/w
   private String ball_color;//r
   private String ball_radius;//r
   Ball(String ball_name,String ball_color,String ball_radius)
   {
	   this.ball_name=ball_name;
	   this.ball_color=ball_color;
	   this.ball_radius=ball_radius;
   }
   public String getBallName()
   {
	   return ball_name;
   }
   public void setBallName(String ball_name)
   {
	   this.ball_name=ball_name;
   }
   public String getBallColor() 
   {
	   return ball_color;
   }
   public String getBallRadius()
   {
	   return ball_radius;
   }
}

