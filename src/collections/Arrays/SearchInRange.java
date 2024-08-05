package collections.Arrays;

public class SearchInRange
{
	public static void main(String[] args) 
	{
		int[] arr = {18, 12, 43, 5, 67, 81, -9, 45, -32};
		int target = 5;
		
		System.out.println(SearchWithinRange(arr, target, 1, 4));
	}	
		static int SearchWithinRange(int[] arr, int target, int start, int end)
		{
			if(arr.length == 0)
			{
				return -1;
			}
			
			for(int i=start; i<=end; i++)
			{
				if(arr[i]== target)
				{
					return i;
				}
			}
			
			return -1;
		}
}

