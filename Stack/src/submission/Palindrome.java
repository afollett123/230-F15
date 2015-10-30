package submission;
import java.util.Stack;


public class Palindrome {
	public static boolean isPalindrome(String s) {
		Stack stack = new Stack();
		
		for (int i = 0; i < s.length(); i++){
			stack.push(s.charAt(i));
			
		}
		String reverseString = "";
		while (!stack.isEmpty()){
			reverseString = reverseString+stack.pop();
		}
		return s.equals(reverseString);
	}
}
// big oh is O(n)^2