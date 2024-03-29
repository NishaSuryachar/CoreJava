package practiceprograms;

public class Pgsumne {

	public static void main(String[] args)
	{
		String s="APPLESWEET";
		String rev="";
		String str = s.toUpperCase();
        for(int i=str.length()-1;i>=0;i--)
        {
        	rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        
        
        
        System.out.println("===================================");
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        	{
        		System.out.println(s.charAt(i));
        	}
        }
        
        
        int n1=0,n2=1,sum=0;
        for(int i=0;i<=10;i++)
        {
        	System.out.println(n1);
        	sum=n1+n2;
        	n1=n2;
        	n2=sum;
        }
        
        int n=121,temp=n,re=0,r=0;
        while(n>0)
        {
        r=n%10;
        re=re*10+r;
        n=n/10;
        }
        if(temp==re)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
        
        String st="StringReverse";
        String reverse="";
        for(int i=st.length()-1;i>=0;i--)
        {
           reverse=reverse+st.charAt(i);
        }
         System.out.println(" reversed String are :"+reverse);
     }

}
