package collections.Arrays;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] nums = {32, 23, 56, -23, 65, 11, 19, 87, -8, 59};
		int target = -8;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
	}
	
		static int linearSearch(int[] arr, int target)
		{
			if(arr.length==0)
				return -1;
			
			for(int i  = 0; i<arr.length; i++)
			{
				if(arr[i] == target)
				{
					return i;
				}
			}
			
			return -1;
		}
		
		
		static int linearSearch2(int[] arr, int target)
		{
			if(arr.length==0)
				return -1;
			
			for(int element : arr)
			{
				if(element == target)
				{
					return element;
				}
			}
			
			return -1;
		}
		
}
