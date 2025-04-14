package com.am;

public class Ex08 {
	public static void main(String[] args) {
		double su1 = 3.14;
		Double su2 = 3.14;
		Double su3 = new Double(3.14);
		Double su4 = new Double("3.14"); //String으로 매개변수를 받는 생성자가 있음
		
		System.out.println(Double.parseDouble("3.14")+1);
		
		double a = 5;
		double b = 0;
		System.out.println(a/b); //1.6666...
		
		System.out.println(Double.isInfinite(a/b)); //5/0 => true
		System.out.println(Double.isNaN(a/b)); //5/0 => false
		
		double c = 0;
		System.out.println(Double.isInfinite(c/b)); //0/0 => false
		System.out.println(Double.isNaN(c/b)); //0/0 => true
	}
}
