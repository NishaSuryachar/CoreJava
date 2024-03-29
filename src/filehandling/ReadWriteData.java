package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class ReadWriteData
{
   public static void main(String[] args) throws IOException
   {
		try
		{
			FileReader fin=new FileReader("C:\\programs\\Questions.txt");
			BufferedReader bf=new BufferedReader(fin);
			
			 FileOutputStream fos=new FileOutputStream("C:\\programs\\NewDoc.txt");
			 PrintWriter pw=new PrintWriter(fos);
			 String ch=bf.readLine();
				while(ch!=null)
				{
					pw.println(ch);
					ch=bf.readLine();
				}
				pw.flush();
			    System.out.println("data written");
		} 
		    
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
         
	}
}

