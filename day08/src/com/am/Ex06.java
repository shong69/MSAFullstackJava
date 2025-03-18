package com.am;

public class Ex06 {
	public int su6 = 6666;
	public static Ex06 obj = new Ex06();
	
	private Ex06() {}  //객체의 생성을 불허하며 non-static임
	public void func06() {}
	public static Ex06 newInstance() {
		
		return new Ex06();
	}
}
