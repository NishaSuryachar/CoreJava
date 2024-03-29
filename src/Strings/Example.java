package Strings;

public class Example {

	public static void main(String[] args) 
	{
		String s1="Apple";
        String s2=new String("Apple");
        System.out.println(s1==s2);//here it will compare the referenes of s1 and s2 [false]
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.hashCode()==s2.hashCode());//true
        System.out.println(s1);//Apple
        System.out.println(s2);//Apple
        }
	}
//    The object for a string gets created when we initialize value ,the dedicated block of memory will get created inside the heap area called 
//   "String constant pool" inside that  String constant pool the object get created with reference inside that reference the value means "Apple"
 //   gets stored and the s1 is pointing to that object that having reference.

//another ways to initialize the value to a string is with new keyword when we initialize value,the dedicated block of memory will get
//created inside the heap area called "String constant pool" inside that  String constant pool the object object get created with
//reference ,inside that reference the value means "Apple" gets stored.and it will take the reference and in the heap area object [Apple]
//gets created with reference then s2 is pointing to that reference now the reference of s1 and reference of s1 is different

//the string is subclass of object class so by default it overrides the methods inside object class so here string overrides the equals() methods 
//it will comparing the state of a object instead reference of a object because by default it is overridden.

///the string is subclass of object class so by default it overrides the methods inside object class so here string overrides the hashcode() methods 
//so the hashcode is generated based on the state of an object instead based on the reference because by default it is overridden.