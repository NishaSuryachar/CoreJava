package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData
{

	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin=new FileInputStream("C:\\programs\\Example.txt");
			try
			{
				int i=fin.read();
				while(i!=-1)
				{
					System.out.print((char)i);
					i=fin.read();
				}
				
			}
			catch (IOException e)
			{
				System.out.println("Exception Handled");
			}
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}
}
}