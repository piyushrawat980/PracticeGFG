package dataStructures;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {

	LinkedList<String> list = new LinkedList<String>();
	
/*	list.push("A");
	list.push("B");
	list.push("C");
	list.push("D");
	list.push("F");
*/	
	
	list.offer("A");
	list.offer("B");
	list.offer("C");
	list.offer("D");
	list.offer("F");
	
//	list.poll();
	
	list.add(4,"E");
	list.remove("E");	
	
	System.out.println(list.indexOf("F"));
	
	System.out.println(list.peekFirst());
	System.out.println(list.peekLast());
	
	list.addFirst("0");
	list.addLast("G");
	String first = list.removeFirst();
	String last = list.removeLast();	
	
	System.out.println(list);
	}

}
