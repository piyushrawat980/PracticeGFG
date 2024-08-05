package javaCollections;

import java.util.HashMap;

public class HashMapAwesomeness 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		int c=35;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("John", 10);
		happy.put("Eric", 25);
		happy.put("Chris", 78);
		
		System.out.println(happy.get("b"));
		
		System.out.println(happy.values());
		System.out.println(happy.keySet());
		
		System.out.println(happy.containsKey("d"));
		
		System.out.println(happy);
		
		happy.put("Tom", 25);
		System.out.println(happy);
		
		happy.replace("Eric",445);
		System.out.println(happy);
		
		happy.putIfAbsent("Rajesh", 100);
		System.out.println(happy);	
		
		happy.remove("Eric");
		System.out.println(happy);
		
		try 
		{
			System.out.println(5/0);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Inside Catch block");
		}
		
		finally
		{
			System.exit(0);
		}
		
	}
}
