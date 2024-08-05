package superKeyword;

public class Person {

	public void message()
	{
		System.out.println("This is PERSON Class !!");
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.display();
	}
}

class Student extends Person
{
	public void message()
	{
		System.out.println("This is the STUDENT Class !!");
	}
	
	void display()
	{
		message();
		super.message();	
	}
}