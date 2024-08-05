package javaConcepts;

public class InterfaceAndClass implements MyInterface{

	int sum=0;
	
	public static void main(String[] args) 
	{
		InterfaceAndClass i1= new InterfaceAndClass();
		i1.IntMethod1();
	}

	@Override
	public void IntMethod1() 
	{
		sum = InterfaceAndClass.num1+ InterfaceAndClass.num2;
	}

}

// Variables are used like static variables i.e., ClassName.variableName