package javaConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorVsListiterator {

	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Burger");
		food.add("hotdog");
		System.out.println("ArrayList iterator: "+food.iterator());
		System.out.println("ArrayList ListIterator: "+food.listIterator());
		
		String str="ttttt";
		
		StringBuffer sbfr = new StringBuffer("Hey");
		sbfr.append(" You");
		System.out.println(sbfr);
		
		Iterator itr = food.iterator();
		
		while(itr.hasNext())
		{
		 System.out.println("Forward Traversal of Iterator : "+itr.next());
		}
		
		ListIterator Litr = food.listIterator();
		
		while(Litr.hasNext())
		{
		 System.out.println("Forward Traversal of LIST Iterator : "+Litr.next());
		}
		
		while(Litr.hasPrevious())
		{
		 System.out.println("Backward Traversal of LIST Iterator : "+Litr.hasPrevious());
		 break;
		}
		
	}

}
