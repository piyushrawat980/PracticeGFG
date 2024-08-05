package stringManipulation;

public class LargestElementInArray {

	public static void main(String[] args) 
	{
		int arr[]= {23, 45, 43, 101, 56, 71, 59, 96, 73};
		int len = arr.length;
		int max= arr[0];
		
		for(int i = 1; i<arr.length;i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest Element is "+ max);
	}

}
