package Strings;

public class Example2 {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="hi";
		String s3=s2;//the reference of s2 object is copying to the s3
		s1=s3;//the reference of s3 object is copying to the s1
		System.out.println(s1=="hi");//[true]here it will compare the references of s1 and hi ,both are same because the reference of s2 object is 
		//copying to the s3 and the reference of s3 object is copying to the s1
		System.out.println(s1.hashCode()==s2.hashCode());//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1);//hi
		System.out.println(s2);//hi
		System.out.println(s3);//hi
		
	}

}
//here the reference of s2 is copying to s3 and s1 also so the values inside the s2 is copying to s3 and s1 also