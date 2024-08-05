package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWord {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		String str = "my name is piyush or is my name something else";
		
		String[] str2 = str.split(" ");
		int count =0;
		
		for(String words : str2)
		{
			if(hMap.containsKey(words))
			{
				hMap.put(words, hMap.get(words)+1);
			}
			
			else
				hMap.put(words, 1);			
		}
		
		for(Map.Entry<String, Integer> entry : hMap.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+ " & Value: "+entry.getValue());
		}		
	}

}
