package javaCollections;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) 
	{
	
		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		countries.put("India", "New Delhi");
		
		//countries.remove("USA");
		
		System.out.println(countries.containsValue("Moscow"));
		// boolean result
		
		System.out.println(countries.containsKey("Malaysia"));
		System.out.println(countries);
		
		System.out.println(countries.get("India"));
		//countries.clear();
		
		countries.replace("USA", "Pheonix");
		
		System.out.println("Size: "+countries.size());
		System.out.println(countries);
		
		for(String str: countries.keySet())
		{
			System.out.println("Key: "+ str +"; Value-> "+ countries.get(str));
		}
		
	}

}
