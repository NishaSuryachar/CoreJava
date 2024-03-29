package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssignment {

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
		System.out.println("=========Printing using Iterator Loop=========");
		Iterator itr=vehicle.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		vehicle.remove(2);
		System.out.println(vehicle);
	}

}
