package mathematical;

public class SumofDigitPalindrome 
{

	public static void main(String[] args) 
	{
		SumofDigitPalindrome S1 = new SumofDigitPalindrome();
		S1.SDigitPalindrome(994);
		
	}
	
	public void SDigitPalindrome(int N)
	{
		int sum =0;			
		while(N!=0)
		{
		int rem = N%10; // rem = 6
		
		N= N/10;		// N = 5
		sum = sum+rem;
		}
		
		int digit = sum;	//digit = 11
		int r=0;
		int newNum=0;
		while(digit!=0)
		{
			r = digit%10;				// r= 1				// r=1
			newNum = (newNum*10) + r;	// newNum = 1		// newNum =11
			digit= digit/10;			//digit = 1			// digit = 0
		}
		
		if(newNum == sum)
		{
			System.out.println("It is A Palindrome !!");
		}
		
		else
			System.out.println("It is NOT a Palindrome !!");
		
/*
 * 		int digit = sum;	//digit = 343
		int r=0;
		int newNum=0;
		while(digit!=0)
		{
			r = digit%10;				// r= 3				// r= 4				// r=3
			newNum = (newNum*10) + r;	// newNum = 3		// newNum = 34		// newNum= 343
			digit= digit/10;			// digit = 34		// digit = 3		//digit = 0
		}
 
 * */		
		
	}
}