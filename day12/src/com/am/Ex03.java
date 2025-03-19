package com.am;
class MyArray{
	Object[] arr = new Object[0];
	void add(Object su) {
		//�迭�� �����ؼ� ũ�⸦ �ø��� �������� �Է°� ����
		Object[] before = arr;
		arr= new Object[arr.length+1];
		for (int i = 0; i < before.length; i++) {
			arr[i] = before[i]; 
		}
		arr[arr.length-1] = su;
	}
	void remove(int idx) {
		Object[] before = arr;
		arr = new Object[before.length-1];
		for (int i = 0; i < idx; i++) { //idx �պκ� ����
			arr[i] = before[i];
		}
		
		for (int i = idx+1; i < before.length; i++) { //idx �޺κ� ����
			arr[i-1] = before[i];
		}
	}
	
	Object get(int idx) {
		return arr[idx];
	}
	int size() {
		return arr.length;
	}
	void set(int idx, Object val) {
		arr[idx] = val; 
	}
}
public class Ex03 {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		
		arr.add(true);
		arr.add("�ι�°");
		arr.add("����°");
		arr.add(3.14);
		arr.add("�ټ���°");
		
		arr.set(2, 3333);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
