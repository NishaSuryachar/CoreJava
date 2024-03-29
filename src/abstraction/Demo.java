package abstraction;

public interface Demo
{
    void m1();//non static method,it will condsidered it as public abstract in nature-[like abstract method]
    void m2();//non static method,it will condsidered it as public abstract in nature-[like abstract method]
    public static void m3()
    {
    	
    }
}

//rules:1) non-static variable not allowed if we declared non static variabl it will consider it as a "final static" variable 
//      2) non-static method can declared without body it will condsidered it as public abstract in nature and ended with semi colon
 //     3) static method can be declared in interface with body but it cannot inherited from subclass we can access the static method by using interface name
//      4) constuctor not allowed
//      5) static or non-static initializers(multiline) not allowed