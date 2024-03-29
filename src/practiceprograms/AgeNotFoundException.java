package practiceprograms;

public class AgeNotFoundException extends Exception
{
    public String getMessage()
    {
    	return "Not eligible to Vote";
    }
}
