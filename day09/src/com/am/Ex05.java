package com.am;

public class Ex05 implements Cloneable{ //클로너블 인터페이스 : 클론 메서드를 쓸 수 있다고 표현하는 기능
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Ex05 me = new Ex05();
		
		Object me2 = me.clone();
		
		//모든 객체는 clone()이 가능하지만 보안을 위하여 이를 제한하는 인터페이스를 만든 것
		
	}

}
