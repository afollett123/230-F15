package submission;

import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	{	
	head = null;
	tail = null;
	}
	public void enqueue(T newEntry) {
		Node newNode = new Node (newEntry, null);
		if (isEmpty ())
			head = newNode;
		else
			tail.setNextNode(newNode);
		tail = newNode;
		
	}


	public T dequeue() {
		if(isEmpty()){
			if (tail == head){
				tail = null;
			}
		}
		head = head.next;
		return null;
	}


	private T setData(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	private T getHead() {
		
		return null;
	}


	public T peek() {
		if (isEmpty())
			throw new IllegalStateException();
		else
		return head.getData();
	}


	public boolean isEmpty() {
		
		return (head == null) && (tail == null);
	}


	public void clear() {
		if (!isEmpty()){
		dequeue();
		}
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
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
		
		public T getData() {
			// TODO Auto-generated method stub
			return null;
		}

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
	
	public static void main(String[] args) {
		
		Queue q = new LinkedQueue();
		
		q.enqueue("Jill");
		q.peek();
		q.enqueue("Steph");
		q.enqueue("Jon");
		q.dequeue();
		q.enqueue("Kyla");
		q.dequeue();
		q.enqueue("Zoe");
		q.enqueue("Julie");
		q.dequeue();
	}

}
