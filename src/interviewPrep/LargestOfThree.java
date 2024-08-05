package interviewPrep;

public class LargestOfThree {

	public static void main(String[] args) 
	{	
		int a = 90;
		int b= 50; 
		int c= 87;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(" Largest is :: "+ a);
			}
			
			else
			{
				System.out.println(" Largest is :: "+ c);
			}
			
		}
		
		else 
		{
			if(b>c)
			{
				System.out.println(" Largest is :: "+ b);
			}
			else
				System.out.println("Largest is :: "+c);
		}
	}
}