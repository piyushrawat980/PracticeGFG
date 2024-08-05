package dataStructures;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Andrew", 10);
		map.put("David", 20);
		map.put("Lucius", 30);
		
		System.out.println("Size of the map is :: "+ map.size());
		
		System.out.println(map);
		
		if(map.containsKey("Andrew"))
		{
		Integer a = map.get("Andrew");	
		
		System.out.println("Value for the key "+ "\"Andrew\" is " + a);
		}

		map.remove("David");
		System.out.println(map);
	}	
}
