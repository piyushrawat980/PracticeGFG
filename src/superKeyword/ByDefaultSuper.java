package superKeyword;

public class ByDefaultSuper {
	
	public static void main(String[] args) 
	{
		new Base();
		System.out.println("INSIDE MAIN method");
	}

}

class SuperParent
{
		SuperParent()
		{
			System.out.println("Parent Class's NO argument Constructor !!");
		}
		
		SuperParent(int A)
		{
			System.out.println("Parent Class's 1 Argument Constructor !!");
		}
		
}

class Base extends SuperParent
{
	Base()
	{
		System.out.println("Base Class's NO argument constructor !!");
	}
}

/*
 * 				OUTPUT ::
 * 
 * Parent Class's NO argument Constructor !!
 * Base Class's NO argument constructor !!
 * INSIDE MAIN method
 * 
 *  
 */