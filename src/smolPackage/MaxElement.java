package smolPackage;

public class MaxElement {

	public static void main(String[] args) 
	{
		int[] arr = {1, 48, 21, 45, 6, 33, 42};
		System.out.println(max(arr));
		System.out.println(maxRange(arr, 2, 5));
	}

	static int max(int[] arr) 
	{
		int maxVal=arr[0];
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]>maxVal)
			{
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	static int maxRange(int[] arr, int start, int end) 
	{
		// Edge cases handling
		if(end<start)
		{
			return -1;
		}
		
		// Main functioning Code
		int maxVal=arr[0];
		for(int i = start; i<end;i++)
		{
			if(arr[i]>maxVal)
			{
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	
	static void reverse(int[] arr)
	{
		int start =0;
		int end = arr.length;
		
		while(start<end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
		
	}

	static void swap(int[] arr, int index1, int index2) 
	{
		int temp = arr[index1];
		arr[index1]= arr[index2];
		arr[index2]= temp;
	}	
}
