package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData2
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\programs\\Questions.txt");
			try
			{
				int ch=fin.read();
				while(ch!=-1)
				{
					System.out.print((char)ch);
					ch=fin.read();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Exception Handled");
			}	
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not Available!!!");
		}

	}

}