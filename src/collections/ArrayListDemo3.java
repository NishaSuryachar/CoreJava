package collections;

import java.util.ArrayList;

public class ArrayListDemo3
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
        System.out.println("Entered Elements Are:");
        for(int i=0;i<a1.size();i++)
        {
        	System.out.println(a1.get(i));
        }
	}

}
