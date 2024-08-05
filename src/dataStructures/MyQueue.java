package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {

	Queue<String> queue = new LinkedList <String>();
	
	queue.offer("Karen");		// Enqueue --> Add element
	queue.offer("Chad");		// Dequeue --> Remove element from Queue 
	queue.offer("Steve");
	queue.offer("Harold");
	
	System.out.println("Is empty ? "+ queue.isEmpty());
	System.out.println("Containts " + queue.contains("Chad"));
	System.out.println("Queue Size "+ queue.size());
	
	System.out.println("PEEKING  :: "+ queue.peek());
	queue.poll();
	queue.poll();
	queue.poll();
	queue.poll();
		
	System.out.println(queue);
	/*	Uses?
	 *	Keyboard buffer
	 *	Printer Queue
	 *	Used in LinkedLists, Priority queue, BFS
	 * 
	 * */
	
	
	}
}
