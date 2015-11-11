package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	
	
	public void enqueue(T newEntry) {
		tail = (tail + 1) % data.length;
		data[tail] = newEntry;
			
	}


	public T dequeue() {
		if(isEmpty())
			throw new IllegalStateException("Queue is empty");
		else {
			T temp = data[head];
			data[head] = null;
			head = (head + 1) % data.length;
			return temp;
		}}
			// big oh is O(1)
	


	public T peek() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
		else
			return data[head];
	}


	public boolean isEmpty() {
		
		return head == -1;
	}


	public void clear() {
		if (!isEmpty()){
			dequeue();
		}
	}
	
	public boolean isFull() 
    {
        return head==0 && tail == -1 ;
    } 
	
	public String toString() {
		String s = data[head].toString();
		for (int i = head+1 % data.length; i >= 0; i--)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}

}
