package collections.Arrays;

public class EvenDigits {

	public static void main(String[] args) 
	{
		int[] nums = {12, 354, 3, 56, 5674};
//		System.out.println(findNumbers(nums));
		
		System.out.println("Digits in a number: "+digits(5463278));
	}
	
	static int findNumbers(int[] nums)
	{
		int count =0;
		for(int num : nums)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num)
	{
		int numOfDigits = digits(num);
		if(numOfDigits % 2==0)
		{
			return true;
		}
		
		return false;
	}
	
	static int digits(int num)
	{
		int count = 0;
		while (num>0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	
	static int digits2(int num)
	{
		if(num <0)
		{
			num = num * -1;
		}
		
		return (int)(Math.log10(num)) + 1;
	}
	
}
