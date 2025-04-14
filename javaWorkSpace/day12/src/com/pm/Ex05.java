package com.pm;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
	public static void main(String[] args) {
		//FIFO(first in first out)
		Queue que = new LinkedList();
		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");
		que.offer("다섯번째");
		
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());'
		while(que.peek()!=null) {
			System.out.println(que.poll());
		}
		
	}
}
