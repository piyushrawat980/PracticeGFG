package interviewPrep;

public class FindMissingNumber {

	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,6,7,8,9};
		int sum=0;
		
		int length = arr.length;
		
		int total = (length*(length+1))/2;
		System.out.println("Total"+total);
		
		for(int i =0; i<length-1; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum"+sum);
		
		System.out.println("missing number is"+(total-sum));		
	}
}