package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class OccurencefVowelsInString {

	public static void main(String[] args) 
	{
		String str = "selenium";
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		char[] arr= str.toCharArray();
		
		for(char c: arr)
		{
			//Integer c = hmap.get(str.charAt(i));
			if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				hmap.put(c, hmap.getOrDefault(c, 0)+ 1);
			}
			
		}	
		
		for(Map.Entry entry : hmap.entrySet())
		{
			System.out.println("KEY- "+ entry.getKey()+ "| Value- "+entry.getValue());
		}
		
	}
}
