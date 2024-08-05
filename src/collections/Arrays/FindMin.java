package collections.Arrays;

public class FindMin {

	public static void main(String[] args) 
	{
		
		int[] arr = {18,  81, -9, 12, 67, 43, 5, 45, -32};

		System.out.println("$$ " +min(arr));
	}
	
	static int min(int[] arr)
	{
		int min = arr[0];
		
		for(int i =0; i< arr.length;i++)
		{					
			if(arr[i]<=min)
			{
				min = arr[i];

			}		
		}
		return min;
	}

}
