package com.pm;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
	public static void main(String[] args) {
		//FIFO(first in first out)
		Queue que = new LinkedList();
		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");
		que.offer("�ټ���°");
		
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
