package interviewPrep;

public class OverloadMain {

	public static void main(String str) 
	{
	System.out.println("MAIN method with 1 String type argument ! "+ str);
	}
	
	public static void main(int a, int b) 
	{
	System.out.println("MAIN method with 2 Integer type arguments ! "+(a+b));
	main("Roronoa Zoro");
	}
	
	public void main(float x, float y) 
	{
	System.out.println("MAIN method with 2 float type arguments ! "+ (x*y));
	main(456, 53279);
	}
	
	
	public static void main(String[] args) 
	{
	System.out.println("OG MAIN method with String[] args ");
	OverloadMain o1 = new OverloadMain();
	o1.main(56.89f,654.87f);
	}

}
