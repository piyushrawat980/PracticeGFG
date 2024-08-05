package dataStructures;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();
		
		stack.push("RDR 2");
		stack.push("The Last of Us");
		stack.push("Ghost of Tsushima");
		stack.push("Detroit Becomes Human");
		
//		System.out.println(stack.peek());
	//	System.out.println(stack.search("RDR"));
		
		for(int i = 0; i< 1000000000; i++)
		{
			stack.push("Fallout 76");
		}
		
	}   
}