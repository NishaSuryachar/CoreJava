package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForEachLoopDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> vehicle=new ArrayList();
		vehicle.add("Cars");
		vehicle.add("bus");
		vehicle.add("cycle");
		vehicle.add("Scooter");
		vehicle.add("Aeroplane");
		System.out.println(vehicle);
		System.out.println("=========Printing using for Loop=========");
		for(int i=0;i<vehicle.size();i++)
		{
			System.out.println(vehicle.get(i));
		}
		System.out.println("=========Printing using forEach Loop=========");
		for(String s:vehicle)
		{
			System.out.println(s);
		}
		System.out.println("=========Printing using Iterator Loop=========");
		Iterator itr=vehicle.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
