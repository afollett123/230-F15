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
		return data[top - 1];
	}

	
	public boolean isEmpty() {
		return top == 0;
	}

	
	public void clear() {
		//return  == 0;
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}

}
