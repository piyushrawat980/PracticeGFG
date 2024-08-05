package interviewPrep;

public class StaticClass {
	
	static int staticVariable;

static {
	
	System.out.println("Static Block !");
	staticVariable = 30;
}

static void staticMethod()
	{
		System.out.println("StaticMethod");
		System.out.println(staticVariable);
	}

	public class Program1
{
	static 
	{
		System.out.println("Program1");
	}
}

	public static void main(String[] args) 
	{

		StaticClass.staticVariable=50;
		StaticClass.staticMethod();
	}

}
