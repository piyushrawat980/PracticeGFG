package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofCharactersInString {

	public static void main(String[] args) 
	{
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hMap2 = new HashMap<Character, Integer>();
		
				
		String input = "missisipi";	
		
		char[] strArray = input.toCharArray();
		
		for(char c: strArray)
		{
			if(hMap.containsKey(c))
			{
				hMap.put(c, hMap.get(c)+1);
			}
			
			else 
			{
				hMap.put(c, 1);
			}
		}
		
		for(Map.Entry entry : hMap.entrySet())
		{
			System.out.println("Key: "+ entry.getKey()+ "-- Value: "+ entry.getValue());
		}

			// To copy HashMap into another
			hMap2.putAll(hMap);
			
			System.out.println("Second HashMap");
			for(Map.Entry entry : hMap2.entrySet())
			{
				System.out.println("Key: "+ entry.getKey()+ "-- Value: "+ entry.getValue());
			}
			
	}

}
