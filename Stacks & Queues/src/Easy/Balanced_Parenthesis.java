package Easy;

import java.util.Stack;

public class Balanced_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "{[]()}";
		
		System.out.println(isValid(str));

	}
	
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		
		//Iterating over the whole string
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				//push the character to the stack
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				
				//check the element at top of stack
				char p = stack.peek();
				
				if(ch == ')' && p!= '(') {
					return false;
				}
				else if(ch == '}' && p!= '{') {
					return false;
				}
				else if(ch == ']' && p!= '[') {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
			
			// return true if the stack is empty, otherwise false
			return stack.isEmpty();
			
		
	}

}
