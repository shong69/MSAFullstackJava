package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		// ���ÿ��� ��Ű������ �����ؼ� ��� �ǵ��� �� -> �����Ϸ��� ��� Ŭ������ ��Ű���� �ٿ���
		java.lang.String msg = "Hello World";
		java.lang.System.out.println(msg);
		
		
		//----------------------------------------------
		//String ��ü�� ����� ��ĵ�
		String msg1 = new String(); //�⺻�����ڷ� String ��ü ����
		String msg2 = new String(msg);
		String msg3 = new String(new char[] {'a', 'b','c'});
		String msg4 = new String(new byte[] {65, 66, 67});
		
		//-----------------------------------------------
		//String ���� �޼���
		char ch1 = msg.charAt(1); //1��° ���ڸ� char�� ��ȯ
		String concatMsg = msg.concat("!!!"); //�Ű������� ���� ���ڿ��� ���ļ� ���ڿ��� ��ȯ
		String msg5 = "ja";
		String msg6 = "va";
		String msg7 = "java";
		String msg8 = msg5 + msg6; // + ��ȣ�� ���ڿ��� ��ġ�� ���ο� ���ڿ� ��ü�� ��ȯ�ؾ� �Ѵ�
		String msg9 = msg5.concat(msg6);// concat�� ���ο� ��ü�� ��ȯ��
		System.out.println(msg7==msg8); //���ϼ� ��(�޸� �ּ� ��)
		System.out.println(msg7==msg9);
		System.out.println(msg8==msg9);
		
		
	}
}
     