package smolPackage;

public class Main {

	public static void main(String[] args) 
	{
		// Static method: Belongs to the class itself
		sayHi();	
		
		// Non- static: Belongs to the instance of a class
		Main m = new Main();
		m.sayPancake();
	}
	
	static void sayHi()
	{
		System.out.println("Hi !");
	}
	
	void sayPancake()
	{
		System.out.println("pancake !");
	}
}
