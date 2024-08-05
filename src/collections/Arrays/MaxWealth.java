package collections.Arrays;

public class MaxWealth {

	public static void main(String[] args) 
	{
		int[][] arr = {
				{1, 2, 3},
				{3, 2, 4, 2},
				{2, 3, 4},
				{5, 3, 2}
		};
		
	System.out.println("Max element -> "+maximumWealth(arr));
	
	}
	
	static public int maximumWealth(int[][] accounts)
		{ 		
		int max= 0;
		
		for(int[] ints  : accounts)
			{
	//	New sum for a row every time we chose a different row		
			int rowsum=0;
			for(int anInt: ints)
				{
					rowsum = rowsum + anInt;
				}
		// Check whether the sum of this row's accounts is greater than maximum
			if(rowsum > max)
				{
					max = rowsum;
				}			
			}
		return max;
		}
}
