package interviewPrep;

public class CheckReturnType {

	public static void main(String[] args) 
	{		
		CheckReturnType c1= new CheckReturnType();
		c1.mySum(30, 45);
		System.out.println();
	}
	
	public int mySum(int a, int b)
	{

		 int Sum = a+b;
			System.out.println("SUM is :: "+Sum);
		 return Sum;	
	}
}