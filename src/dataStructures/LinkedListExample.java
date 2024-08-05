package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		
		LinkedList<String> namesList = new LinkedList<>();
		namesList.add("Jonathan");
		namesList.add("Puloski");
		namesList.add("Jack");
		namesList.add("Andrew");
		System.out.println(namesList.get(2));
		namesList.add(2, "Tom");
		
		ArrayList<String> namesAL = new ArrayList<>();
		namesAL.add("Jonathan");
		namesAL.add("Puloski");
		namesAL.add("Jack");
		namesAL.add("Andrew");
		System.out.println(namesAL.get(2));
		
	}

}
