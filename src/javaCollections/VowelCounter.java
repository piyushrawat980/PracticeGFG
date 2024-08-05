package javaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VowelCounter 
{
    public static void main(String[] args) 
    {
    	ArrayList<String> fruits = new ArrayList<>();
    	
    	fruits.add("Apple");
    	fruits.add("Mango");
    	fruits.add("Apricot");
    	fruits.add("Banana");
    	
    	HashMap<String, HashMap<Character, Integer>> resultMap =
    			new HashMap<String, HashMap<Character, Integer>>();
    	
    	for(String fruit: fruits)
    	{
    		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
    		int count=0;
    		for(char ch: fruit.toLowerCase().toCharArray())
    		{
    			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    			{
    				count++;
    				countMap.put(ch, count);
    			}
    		}    		
    		resultMap.put(fruit, countMap);    		
    	}
    	
    	for(Map.Entry<String, HashMap<Character, Integer>> entry:resultMap.entrySet())
    	{
    		System.out.println(entry.getKey()+"---"+ entry.getValue());
    	}
	}
}
