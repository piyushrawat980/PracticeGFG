package javaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInList {

	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(0);
		myList.add(1);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(5);
		myList.add(3);
		myList.add(6);
		myList.add(0);
		myList.add(0);
		myList.add(1);
		myList.add(1);
		
		System.out.println(myList);
	
		Set<Integer> setToReturn = new HashSet<Integer>();
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(Integer i : myList)
		{
			if(setToReturn.add(i) == false)
			{
				set1.add(i);
			}
		}
		
		System.out.println(set1);
	}
}
