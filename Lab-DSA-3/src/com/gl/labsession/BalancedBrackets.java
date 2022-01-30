package com.gl.labsession;
import java.util.Iterator;
import java.util.Stack;
public class BalancedBrackets {
	
	

	public static void main(String[] args) {
		
		String bracletExpression="([[{}]])";
		if(isBlanced(bracletExpression)) {
			System.out.println("Blanced");
		}else {
			System.out.println("Unbalnced brackets");
		}
		

	}

	private static boolean isBlanced(String bracletExpression) {
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<bracletExpression.length();i++) {
			
			char character=bracletExpression.charAt(i);
			if(character=='(' || character=='[' || character=='{') {
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char c;
			switch(character){
				
			case '}':
			c=stack.pop();
			if(c=='(' || c=='[')
				return false;
			break;
			
			case ')':
				c=stack.pop();
				if(c=='{' || c=='[')
				return false;
			break;
			
			case ']':
				c=stack.pop();
				if(c=='(' || c=='{')
				return false;
			break;
			
			}
			
			
		}
		
		return stack.isEmpty();
	}

}
