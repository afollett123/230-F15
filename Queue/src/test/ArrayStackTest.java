package test;

import static org.junit.Assert.*;
import org.junit.Test;
import adt.Stack;
import submission.ArrayStack;

public class ArrayStackTest {
	private Stack<String> stack = new ArrayStack<String>();
	private static int MAX_CAPACITY = 100;

	@Test
	public void testClear() {
		stack.push("A");
		stack.clear();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testPush() {
		stack.clear();
		stack.push("A");
		String s = "| A |\n+++++\n";
		assertTrue(stack.toString().equals(s));
	}
	
	@Test
	public void testPush2() {
		stack.clear();
		stack.push("A");
		stack.push("C");
		String s = "| C |\n| A |\n+++++\n";
		assertTrue(stack.toString().equals(s));
	}
	
	@Test
	public void testPop() {
		stack.clear();
		stack.push("A");
		stack.push("C");
		stack.pop();
		String s = "| A |\n+++++\n";
		assertTrue(stack.toString().equals(s));
	}
	
	@Test
	public void testPopEmpty() {
		stack.clear();
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testPeek() {
		stack.clear();
		stack.push("A");
		stack.push("C");
		stack.peek();
		stack.peek();
		String s = "| C |\n| A |\n+++++\n";
		assertTrue(stack.toString().equals(s));
	}
	
	@Test
	public void testPushMany() {
		// Should exceed initial capacity
		stack.clear();
		String s = "";
		for (int i = 0; i < MAX_CAPACITY; i++) {
			stack.push("X");
			s += "| X |\n";
		}
		s += "+++++\n";
		assertTrue(stack.toString().equals(s));
	}

}
