package practiceprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class pg1
{

	public static void main(String[] args) throws IOException 
	{
        FileReader fr=new FileReader("C:\\programs\\Questions.txt");
        BufferedReader br=new BufferedReader(fr);
        
        FileOutputStream fos=new FileOutputStream("C:\\programs\\Exam.txt");
        PrintWriter pw=new PrintWriter(fos);
        String str=br.readLine();
        while(str!=null)
        {
        	pw.println(str);
        	str=br.readLine();
        }
        pw.flush();
     }
}