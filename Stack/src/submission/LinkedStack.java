package submission;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	private int stackSize;
	
	
	public void push(T newEntry) {
		top = new Node(newEntry, top);
	}
	//Big oh is O(1)

	
	public T pop() {
		T item = peek();
		top = top.next;
		return item;
	}
	//big oh is O(1)
	
	public T peek() {
		return top.data;
	}
	//big oh is O(1)

	public boolean isEmpty() {
		return top == null;
	}
	//big oh is O(1)
	
	public void clear() {
		stackSize = 0;
		return ;
	}
	//big oh is O(1)
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

}
