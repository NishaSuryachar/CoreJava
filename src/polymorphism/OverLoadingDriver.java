package polymorphism;

public class OverLoadingDriver {

	public static void main(String[] args) 
	{
		OverLoading o=new OverLoading();
		System.out.println("parent class");
		o.display(10,20);//parent
		
		
		Loading o1=new Loading();
		System.out.println("child class");
		o1.display(10,20,30.5f);//child
		
		OverLoading o2=new Loading();
		System.out.println("parent class");
		o2.display(10,20);//parent

	}

}
