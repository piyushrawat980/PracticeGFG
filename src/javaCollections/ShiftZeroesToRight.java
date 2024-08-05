package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftZeroesToRight {

	public static void main(String[] args) 
	{
		int arr[]= {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				temp.add(arr[i]);
			}
		}
		System.out.println(temp);
		
		for(int i=0; i<temp.size(); i++)
		{
			arr[i]=temp.get(i);
		}
				
		for(int i=temp.size(); i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
