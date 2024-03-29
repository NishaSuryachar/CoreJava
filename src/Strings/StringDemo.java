package Strings;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s=" karthik ";
		String i="Apple";
		String n="Nisha is Beautiful girl";
		String m="Apple is good for health";
		System.out.println(s.length());//9
		String s1=s.trim();
		System.out.println(s.length());//9
		System.out.println(s1.length());//7
		System.out.println(s.charAt(3));//r
		System.out.println(s1.concat(i));//KarthikApple
		System.out.println(s1.endsWith("tk"));//false
		System.out.println(s1.endsWith("ik"));//true
		System.out.println(s.repeat(5));//repeated 5 times
		System.out.println(n.replace("Beautiful", "Brilliant"));//Nisha is Brilliant girl
        System.out.println(n);
		String n1=n.replace("Beautiful", "Brilliant");
		System.out.println(n1);
	    System.out.println(m);
		System.out.println(m.toUpperCase());
		System.out.println(m.toLowerCase());
		
		
		
	}

}
