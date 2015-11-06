package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	
	
//	public ArrayQueue(int initialCapacity){
//		
//		
//		T[] tempQueue = (T[]) new Object[initialCapacity + 1];
//		data = tempQueue;
//		head = 0;
//		tail = initialCapacity;
//	}
//	
	public void enqueue(T newEntry) {
		tail = (tail + 1) % data.length;
		data[tail] = newEntry;
		
		
	}


	public T dequeue() {
		if(isEmpty())
			throw new IllegalStateException("Queue is empty");
		else {
			T head = data[head];
			data[head] = null;
			head = (head + 1) % data.length;
			return head;
		} // big oh is O(1)
	}


	public T peek() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
		else
			return data[head];
	}


	public boolean isEmpty() {
		
		return head == (tail + 1) % data.length;
	}


	public void clear() {
		head = 0;
		tail = 0;
		
	}
	
	public String toString() {
		String s = data[head].toString();
		for (int i = head+1 % data.length; i >= 0; i--)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}

}
