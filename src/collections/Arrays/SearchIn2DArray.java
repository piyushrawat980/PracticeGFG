package collections.Arrays;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) 
	{
		int[][] arr = {
				{24, 43, 30},
				{76, 32, 88, 10},
				{54, 64, 8},
				{65, 39, 92}
		};
		int target = 39;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		
		System.out.println("Max element -> "+searchMax(arr));
	}

	static int[] search(int[][] arr, int target)
	{
		for(int row = 0; row<arr.length; row++)
		{
			for(int col = 0; col< arr[row].length; col++)
			{
				if(arr[row][col] == target)
				{
					return new int[] {row, col};
				}
			}
		}
//	return target;
		return new int[] {-1, -1};
	}
	
	static int searchMax(int[][] arr)
	{
		int max = arr[0][0];
		for(int row = 0; row<arr.length; row++)
		{			
			for(int col = 0; col< arr[row].length; col++)
			{
				if(arr[row][col] > max)
				{
					max = arr[row][col];
					
				}				
			}			
		}
		return max;
	}
	
}
