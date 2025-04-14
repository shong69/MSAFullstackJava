package com.am;

public class Ex05 {
	public static void main(String[] args) {
		byte su1 = 127;
		Byte su2 = 127;
//		Byte su3 = new Byte(127); 127이 byte가 아닌 int로 인식되고 있음 -> byte로 캐스팅해줘야함
		Byte su3 = new Byte(su1);
		Byte su4 = new Byte("127");
		
		byte su5 = Byte.parseByte("127");
		
		
		short su6 =1;
		Short su7 = 1;
		Short su8 = new Short(su6);
		Short su9 = new Short("1");
	}
}
