package mathematical;

public class ProductOfConsecutiveElements {

	public static void main(String[] args) 
	{
		int arr[]= {4, 6, 9, 12, 25, 20};
		
		int temp=0;
		
		int length= arr.length-1;	// = 5
		
		for(int i =0; i<length; i++)
		{
			temp = arr[i]* arr[i+1];
			System.out.println(temp+ " ");
		}

	}

}
