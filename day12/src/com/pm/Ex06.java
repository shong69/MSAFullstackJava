package com.pm;

import java.util.Deque;
import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		Deque que1 = new LinkedList();
		//queue로 써보기
		que1.offerFirst("1첫번째");
		que1.offerFirst("두번째");
		que1.offerFirst("세번째");
		
		while(que1.peekLast()!= null) { //queue로 뒤에서 꺼낼거니까 peekLast로 꺼냄
			System.out.println(que1.pollLast());
		}
		
		
		//---------------------------------
		Deque que2 = new LinkedList();//que를 앞에서 넣어서 앞으로 꺼냄
		que2.offerLast("2첫번째");
		que2.offerLast("두번째");
		que2.offerLast("세번째");
		
		while(que2.peekFirst()!= null) {
			System.out.println(que2.pollFirst());
		}
		
		//-----------------------------------
		//stack으로 써볼거임-앞으로 넣어서 앞으로 꺼냄
		Deque stack = new LinkedList();
		stack.offerFirst("3첫번째");
		stack.offerFirst("두번째");
		stack.offerFirst("세번째");
		while(stack.peekFirst()!= null) {
			System.out.println(stack.pollFirst());
		}
		
		
		//---------------------------------------
		Deque stack2 = new LinkedList(); //stack을 뒤로 넣어서 뒤로 꺼내도록
		stack2.offerLast("4첫번째");
		stack2.offerLast("두번째");
		stack2.offerLast("세번째");
		
		while(stack2.peekLast() != null) {
			System.out.println(stack2.pollLast());
		}
	}
}
