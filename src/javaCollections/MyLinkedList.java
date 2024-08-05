package javaCollections;

import java.util.LinkedList;

public class MyLinkedList {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		LinkedList<String> linkedList= new LinkedList<String>();

		// LinkedList as Stack -> Element inserted at last will be on Top
/*		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
*/		
		
		// LinkedList as Queue -> Element inserted at First will be on Top
		// Can use Offer or add
		linkedList.offer("A");
		linkedList.add("B");
		linkedList.offer("C");
		linkedList.add("D");
		linkedList.offer("F");
		
	//	linkedList.poll();
		// Will remove the First element i.e., A
		
		linkedList.add(4, "E");
		linkedList.remove(4);
				
		System.out.println("First "+linkedList.peekFirst());
		System.out.println("Last "+linkedList.peekLast());
		System.out.println(linkedList.peek());
		
		linkedList.addFirst("0A");
		linkedList.addLast("G");
		
		System.out.println("First "+linkedList.peekFirst());
		System.out.println("Last "+linkedList.peekLast());
		
		System.out.println(linkedList);
		
		System.out.println("-------------");
		
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println("First- "+ first+ " Last- "+last);

	}

}
