package com.pm;

import java.util.Stack;

public class Ex07 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		
		System.out.println(stack.search("����°"));
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}
}
