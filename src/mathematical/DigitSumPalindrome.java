package mathematical;


//Given a number N.Find if the digit sum(or sum of digits) of N
//is a Palindrome number or not.

public class DigitSumPalindrome 
{

	public static void main(String[] args) 
	{
		DigitSumPalindrome i10 = new DigitSumPalindrome();
		i10.isDigitPalindrome(997);
	}
	
	public void isDigitPalindrome(int N)
	{
		int sum=0;
		int rem =0;
		
		while(N!=0)
		{
			rem = N%10; // rem = 4;		// rem = 9;
			N= N/10;	// N ==99;		// rem =9;
			
			sum = sum +rem ;	// sum = 4		// sum = 13
		}
		
		int	num2 = sum;
		
		System.out.println("Value of SUM is : "+sum);
		// Sum = 25
		
		int palin = 0;
		int rem1 =0;
		
		while(num2!= 0)
		{
			rem1 = num2%10;		//rem1 = 5;		//rem1= 2;
			num2 = num2/10;		//num2 = 2;		// num2 = 0
			palin = (palin*10) + rem1 ;		// palin = 5		// palin= 5*10+2= 52
		}
		
		if (palin==num2)
		{
			System.out.println("Sum of the digit is a Palindrome");
		}
		
		else
			System.out.println("Sum of the digit is NOT a Palindrome");
	}
}