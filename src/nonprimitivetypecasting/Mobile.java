package nonprimitivetypecasting;

public class Mobile
{
	private String brand;
	private String color;
	private String memory;
	Mobile(String brand,String color,String memory)
	{
		this.brand=brand;
		this.color=color;
		this.memory=memory;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getColor()
	{
		return color;
	}
	public String getMemory()
	{
		return memory;
	}

}