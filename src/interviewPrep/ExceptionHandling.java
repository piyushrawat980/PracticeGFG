package interviewPrep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			System.out.println("RESULT : "+ z);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You can not divide by Zero IDIOT !");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a number. OMFG !!");
		}
		
		catch(Exception e)
		{
			System.out.println("Something Went Wrong !!");
		}
		
		finally
		{
			System.out.println(" Finally BLOCK !");
			scanner.close();
		}
	}
}
