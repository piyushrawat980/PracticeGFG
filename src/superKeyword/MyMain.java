package superKeyword;

public class MyMain {

	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.Print();
	}
}

class Grandparent
{
	public void Print()
	{
		System.out.println("Print() of GRANDPARENT Class");
	}
}

class Parent extends Grandparent
{
	public void Print()
	{
		super.Print();
		System.out.println("Print() of PARENT Class");
	}
}

class Child extends Parent
{
	public void Print()
	{	
		super.Print();
		System.out.println("Print() of CHILD Class");
	}
}