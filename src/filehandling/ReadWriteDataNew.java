package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteDataNew
{

	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader fr=new FileReader("C:\\programs\\Nisha.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileOutputStream fos=new FileOutputStream("C:\\programs\\Exam.txt");
		PrintWriter pw=new PrintWriter(fos);
		try 
		{
			String str=br.readLine();
			while(str!=null)
			{
				pw.println(str);
				str=br.readLine();
			}
		    pw.flush();
		}
		catch (IOException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Data Written");
	}
}

