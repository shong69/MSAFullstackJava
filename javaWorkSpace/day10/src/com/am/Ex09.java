package com.am;

public class Ex09 {
	public static void main(String[] args) {
		boolean boo1 = true;
		Boolean boo2 = true;
		Boolean boo3 = new Boolean(boo1);
		Boolean boo4 = new Boolean("true");
		Boolean boo5 = new Boolean("TRUE");
		Boolean boo6 = new Boolean("True");
		System.out.println(boo5); //true Ãâ·Â
		
		Boolean boo7 = Boolean.TRUE;
		System.out.println(boo6 = Boolean.TRUE);
		
	}
}
