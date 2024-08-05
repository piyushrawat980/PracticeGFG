package interviewPrep;

public class subArraySum {
	
	static int subArray(int arr[], int n, int sum)
	{
		int curr_sum;
		
		for(int i=0; i<n; i++)
		{
			curr_sum=0;			// Reset curr_sum for each new starting point
			for(int j =i; j<n; j++)
			{
				curr_sum= curr_sum + arr[j];
				if(curr_sum==sum)
				{
					System.out.println("Sum found between "+ i + " and "+ j);
					return 1;
				}				
			}
		}
		
		return 0;
	}	

	public static void main(String[] args) 
	{
		int arr[]= {15, 2, 4, 8, 9, 5, 10, 23};
		int n= arr.length;
		int sum=23;
		
		subArray(arr, n, sum);
	}

}
