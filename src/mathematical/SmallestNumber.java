package mathematical;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) 
	{
		SmallestNumber s1 = new SmallestNumber();
		s1.mySmallestNumber();
	}
	
	
	public void mySmallestNumber()
	{
		 int[] arr = new int[]{ 4,2,1,7,3,6,9,6 }; 
	
		Arrays.sort(arr);

		System.out.println("Smallest numer :: "+ arr[0]);
	}

}
