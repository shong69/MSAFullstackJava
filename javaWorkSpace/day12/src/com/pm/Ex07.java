package com.pm;

import java.util.Stack;

public class Ex07 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		
		System.out.println(stack.search("세번째"));
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}
}
