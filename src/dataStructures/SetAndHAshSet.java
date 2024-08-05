package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetAndHAshSet {

	public static void main(String[] args) 
	{
		Set<String> names = new HashSet<>();
		
		names.add("Jesse");
		names.add("Walter");
		names.add("Saul");
		names.add("Mike");
		names.add("Gustavo");
		
		System.out.println(names);
		//names.remove("Walter");	
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Sam"));
		System.out.println(names.contains("Jesse"));
		//System.out.println(names);
		
		System.out.println("---------------");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println(" - For Each - ");	
		names.forEach(System.out::println);
		
		System.out.println(" -- Iterator BELOW -- ");	
		
		Iterator<String> namesItr = names.iterator();
		
		while(namesItr.hasNext())
		{
			System.out.println(namesItr.next());
		}
		
		List<Integer> number = new ArrayList<>();
		number.add(5);
		number.add(6);
		number.add(12);
		number.add(12);
		number.add(6);
		number.add(2);
		number.add(8);
		number.add(2);
		number.add(6);
		number.add(12);
		
		System.out.println(number);
		
		Set<Integer> numberSet = new LinkedHashSet<>();
		
		numberSet.addAll(number);
		System.out.println("- Number Set -");
		
		System.out.println(numberSet); 
		
	}
}
  