package com.am;
class MyArray{
	Object[] arr = new Object[0];
	void add(Object su) {
		//배열을 복사해서 크기를 늘리고 마지막에 입력값 삽입
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
		for (int i = 0; i < idx; i++) { //idx 앞부분 복사
			arr[i] = before[i];
		}
		
		for (int i = idx+1; i < before.length; i++) { //idx 뒷부분 복사
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
		arr.add("두번째");
		arr.add("세번째");
		arr.add(3.14);
		arr.add("다섯번째");
		
		arr.set(2, 3333);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
