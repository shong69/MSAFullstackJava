package com.am;

public class Ex06 {
	public int su6 = 6666;
	public static Ex06 obj = new Ex06();
	
	private Ex06() {}  //��ü�� ������ �����ϸ� non-static��
	public void func06() {}
	public static Ex06 newInstance() {
		
		return new Ex06();
	}
}
