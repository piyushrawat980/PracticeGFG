package javaCollections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Burger");
		food.add("hotdog");
		
		// .set(0 will replace the value
		food.set(0, "Sushi");
		
		// .add(0 will add the value and not replace the older value
		food.remove(1);
		
		//food.clear();
		System.out.println("dot contains() -> "+food.contains("Burger"));
		for(int i=0; i< food.size(); i++)
		{
			System.out.println(food.get(i));
		}
		
		System.out.println("EMPTY");		 
	}
}
