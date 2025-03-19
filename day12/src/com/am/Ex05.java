package com.am;

/** 
 * 배열 없는 동적 할당 만들기
 * -> 객체에 값들을 저장하고, 객체가 다음 객체 값을 가지고 있도록 한다
 * **/

class MyLink{
	private class Node{
		int val;
		Node nxt;
		
	}
	Node first;
	int cnt;
	int size() {return cnt;}
	
	int get(int idx) {
		Node temp = first;
		for (int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		return temp.val;
	}
	void add(int su) {
		cnt++;
//		1. 객체에 값 부여
		if(cnt ==1) {
			first = new Node();
			first.val = su; 
		}else {
			Node temp2 = new Node();
			temp2.val = su;
			Node temp = first;
		//마지막 객체의 nxt는 null -> null일때 탈출하는 반복문으로 노드 생성하기
			while(true) {
				if(temp.nxt == null) {break;}
				temp = temp.nxt;
			}
			temp.nxt=temp2; //비어있는 nxt에 새 노드 넣어줌
		}

		
	}
}
public class Ex05 {
	public static void main(String[] args) {
		MyLink arr = new MyLink();
//		java.util.LinkedList arr= new java.util.LinkedList();
		
		
		arr.add(1111);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
