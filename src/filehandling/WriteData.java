package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws FileNotFoundException 
	{
		 FileOutputStream fos=new FileOutputStream("C:\\programs\\Example.txt");
         PrintWriter pw=new PrintWriter(fos);
         pw.println("I LOVE YOU NISHU");
         pw.flush();
         System.out.println("Data written");
         
	}

}
