package JAVAMock;

public class Arraypracty {

	int arr[]= {10,75,30};
	public int largest()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			 max=arr[i];
		}	
			
			return max;
		
	}
	public static void main(String[] args) 
	{
		Arraypracty a=new Arraypracty();
	  System.out.println(a.largest());
	   
	}

}
