package com.am;

/** 
 * �迭 ���� ���� �Ҵ� �����
 * -> ��ü�� ������ �����ϰ�, ��ü�� ���� ��ü ���� ������ �ֵ��� �Ѵ�
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
//		1. ��ü�� �� �ο�
		if(cnt ==1) {
			first = new Node();
			first.val = su; 
		}else {
			Node temp2 = new Node();
			temp2.val = su;
			Node temp = first;
		//������ ��ü�� nxt�� null -> null�϶� Ż���ϴ� �ݺ������� ��� �����ϱ�
			while(true) {
				if(temp.nxt == null) {break;}
				temp = temp.nxt;
			}
			temp.nxt=temp2; //����ִ� nxt�� �� ��� �־���
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
