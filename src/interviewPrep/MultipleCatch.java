package interviewPrep;

import java.io.IOException;

public class MultipleCatch {

	public static void main(String[] args)
	{
		
		int num = 10;
	
		try {
		int div = num/0;
		}
					
		catch(ArithmeticException ie)
		{
			System.out.println("Arithmetic Catch statement !");
		}
		
		catch(Exception e)
		{
			System.out.println(" Exception Catch block ");
		}
	
		
	/*	Convert String to Int and Int to String
	 * 
	 * String str = "5"; int result = Integer.parseInt(str); result+=1;
	 * int num = 10;	String result = Integer.toString(num);
	
	System.out.println(result);
*/		
	}

}
