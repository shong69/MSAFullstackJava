package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		String msg = "ABCDabcd1234";
		
		System.out.println(msg.charAt(4)); //a ���
		
		System.out.println(msg.length()); //12 ���
		
		System.out.println(msg.contains("bc")); //�����ϰ� �ִ��� T/F ���
		
		msg = msg.replace("abcd", "aBCD"); //���ο� ��ü�� �޾Ƴ��� ��
		//Replaces each substring of this string ���� ���ڿ� �� �ٲ���
		//that matches the literal targetsequence with the specified literal replacement sequence.
		
		msg = msg.concat("!@#$"); //���ڿ� �߰�

	}
}
