package com.pm;

import java.util.Deque;
import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		Deque que1 = new LinkedList();
		//queue�� �Ẹ��
		que1.offerFirst("1ù��°");
		que1.offerFirst("�ι�°");
		que1.offerFirst("����°");
		
		while(que1.peekLast()!= null) { //queue�� �ڿ��� �����Ŵϱ� peekLast�� ����
			System.out.println(que1.pollLast());
		}
		
		
		//---------------------------------
		Deque que2 = new LinkedList();//que�� �տ��� �־ ������ ����
		que2.offerLast("2ù��°");
		que2.offerLast("�ι�°");
		que2.offerLast("����°");
		
		while(que2.peekFirst()!= null) {
			System.out.println(que2.pollFirst());
		}
		
		//-----------------------------------
		//stack���� �Ẽ����-������ �־ ������ ����
		Deque stack = new LinkedList();
		stack.offerFirst("3ù��°");
		stack.offerFirst("�ι�°");
		stack.offerFirst("����°");
		while(stack.peekFirst()!= null) {
			System.out.println(stack.pollFirst());
		}
		
		
		//---------------------------------------
		Deque stack2 = new LinkedList(); //stack�� �ڷ� �־ �ڷ� ��������
		stack2.offerLast("4ù��°");
		stack2.offerLast("�ι�°");
		stack2.offerLast("����°");
		
		while(stack2.peekLast() != null) {
			System.out.println(stack2.pollLast());
		}
	}
}
