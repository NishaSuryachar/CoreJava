package Strings;

public class StringBuffer1 {

	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("Nisha "); 
		System.out.println(str.append("very good")); //Nisha very good
		StringBuffer str1=str.insert(1,"ehu"); //Nehuisha very good
		System.out.println(str1);
		System.out.println(str1.delete(1, 4));
		System.out.println(str.replace(6,9,"veryyyy"));
		System.out.println(str.delete(9,13));
		System.out.println(str.reverse());
		
	}

}

