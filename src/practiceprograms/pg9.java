package practiceprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class pg9 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin=new FileInputStream("C:\\programs\\Exam.txt");
		int ch=fin.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fin.read();
		}
	}

}
