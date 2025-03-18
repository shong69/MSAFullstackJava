package com.pm;

public class Ex04 {
	public static void main(String[] args) {
		String msg1 = "Hello World";
		
		//starsWith(), endsWith() -> �� �ڷ��� ��ȯ
		System.out.println(msg1.startsWith("He")); 
		System.out.println(msg1.endsWith("ld"));
		System.out.println(msg1.startsWith("he"));
		System.out.println(msg1.endsWith("l"));
		
		// equals() - ��� ��
		System.out.println(msg1 == "Hello World"); //���ϼ� ��
		System.out.println(msg1.equals("Hello World"));
		
		//byte �迭, ���� �迭�� ��ȯ
		byte[] arr1 = msg1.getBytes();
		char[] arr2 = msg1.toCharArray(); 
		
		//byte�迭�� ���ڹ迭�� ���̰� ���ٰ� ������ ���� -> ms949�� ���� �־ 
		System.out.println(arr1.length == arr2.length); //true
		System.out.println(arr1.length);
		System.out.println(arr2.length); 
		
		//���� �迭�� ���ڿ��� ���ڵ��� ���� �ֱ�
		char[] arr3 = new char[msg1.length()];
		msg1.getChars(0, 11, arr3, 0);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//���ڰ� ��ġ�ϴ� �� ���� ��ȯ
		int idx = msg1.indexOf((int)'W');
		int idx2 = msg1.indexOf('W'); // �ֵ���ǥ�� �־ ����ĳ���� �Ǵϱ� ����� ����
		System.out.println(idx);
		System.out.println(idx2);
		
		//���ڿ��� ����
		int length = msg1.length();
		
		//���ϴ� ��ġ���� ���ڿ� ����
		String msg2 = msg1.replace('H', 'h');
		msg2 = msg2.replace("he", "H");
		System.out.println(msg2);
		
		String msg3 = msg1.substring(0,5); 
		msg3 = msg3.substring(2);
		System.out.println(msg3);
		String msg4 = msg3.toUpperCase();
		msg4 = msg4.toLowerCase();
		
	}
}
