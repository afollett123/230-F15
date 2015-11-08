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


	public T dequeue(<T>) {
		if(isEmpty())
			throw new IllegalStateException("Queue is empty");
		else {
			for (int i = 0; i <Queue.data.length; i++){
			T head = data[i];
			data[i] = null;
			head = (head + i) % data.length;
			return head;
		}}
			// big oh is O(1)
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
		if (isEmpty()){
			throw new IllegalStateException("Queue is empty");
		}
		else 
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
