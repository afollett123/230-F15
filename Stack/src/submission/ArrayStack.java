package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;

	
	public void push(T item) {
		data[top++] = item;
		
	}

	
	public T pop() {
		T result = data [top - 1];
		data[--top] = null;
		return result;
	}

	
	public T peek() {
		return data;
			
	}

	
	public boolean isEmpty() {
		return (data.length == 0);
	}

	
	public void clear() {
		// for loop, set all data values to null
		//set top to 0 - disadvantage
		//re initialize data
		data = (T[]) new Object [MAX];
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}

}
