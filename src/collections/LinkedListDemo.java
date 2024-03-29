package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList cars=new LinkedList();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("i10");
		cars.add("Thar");
		cars.add("Duster");
		System.out.println(cars);
		cars.add(2,"sedan");
		cars.add(4,"baleno");
		System.out.println(cars);
		System.out.println(cars.get(3));//i10
		System.out.println(cars.remove());//BMW
		System.out.println(cars.remove(2));//i10
		System.out.println(cars.remove("Thar"));//true
		System.out.println(cars);//Audi,sedan,baleno,Duster
		LinkedList fruits=new LinkedList();
		fruits.add("Mango");
		fruits.add("Banana");
		System.out.println(fruits);//[Mango, Banana]
		cars.add(fruits);//
		System.out.println(cars);//Audi, sedan, baleno, Duster,Mango, Banana
		fruits.addAll(cars);
		System.out.println(fruits);//[Mango, Banana],[Audi, sedan, baleno, Duster,Mango, Banana]
		fruits.removeAll(fruits);
		System.out.println(fruits);
	}

}
