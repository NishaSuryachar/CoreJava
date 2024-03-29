package Strings;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		StringBuffer s3=new StringBuffer("Hi");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.hashCode()==s2.hashCode());//false
		System.out.println(s1.hashCode()==s3.hashCode());//false
		System.out.println(s1);//Hello
		System.out.println(s2);//Hello
		System.out.println(s3);//Hi
		
	}

}
