package com.pm;

public class Ex01 {
	
	public static String uppercase(String msg) {
		char[] arr1 = msg.toCharArray(); //���� �迭�� ��ȯ
		int gap = 'a' - 'A';
		for (int j = 0; j < arr1.length; j++) {
			arr1[j] += gap;
		}
		return new String(arr1);
	}
	public static void upperCase2(String msg) {
		//�ҹ������� �����ϱ�
		int alpNum = 'z'-'a'+1; //25

		char[] arr = msg.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>=97 && arr[i]<=97+alpNum) { //a���� ũ�ų� z���� ������
				
				System.out.print((char)(arr[i]-32));
			}
		}

	}
	/**concat() �Լ� ��� �����ϱ�
	 * @param msg1
	 * @param msg2
	 * @return
	 */
	public static void concat(String msg1, String msg2) {
//		String result2 = str1.concat(str2); //�̰Ŷ� ������ ����� �������� �ϱ�
		
		int len1 = msg1.toCharArray().length;
		int len2 = msg2.toCharArray().length;
		char[] result3 = new char[len1+len2]; //�迭 ������ 0���� ���� �ʴ´�

//		for (int i = 0; i < result3.length/2; i++) { 
//			result3[i] = str1.charAt(i);
//			result3[i+result3.length/2] = str2.charAt(i);
//
//		} //���� ���� ���ڿ��� ��ġ�� ��쿡�� ������
		
		for (int i = 0; i < result3.length; i++) {
			if(i<len1) {
				result3[i] = msg1.charAt(i);
			}else {
				result3[i] = msg2.charAt(i-len1); //�ε��� - �迭1�� ������ ��ġ ���� ����
			}
		} //���ڿ��� ������ ������� ��ĥ �� ����
		System.out.println(new String(result3)); //�޼ҵ� ȣ���� ������ ���ο� ��ü�� ����
	}
	
	
	
	public static void main(String[] args) {
		//toUpperCase() �޼��� �����غ���
//		String msg = "java";
//		char[] msg2=new char[msg.length()];
//		for (int j = 0; j < msg.length(); j++) {
//			msg2[j] = (char) (msg.charAt(j)-32);
//			System.out.println((char) (msg.charAt(j)-32));
//		}
//		String result = new String(msg2);
//		System.out.println(result);
		
		//------------------------------------
		//�޼��� �����ؼ� ����غ���
//		String msgs = "java";
//		
//		String result1 = uppercase(msgs);
//		System.out.println(result1);
//		System.out.println(msgs.toUpperCase());
		
		//��ȿ�� �����غ���
		//-> �ҹ��ڸ� �빮�ڷ� �Է��ϵ���
//		upperCase2("java");
		
		//----------------------------------
		String msg1 = "ja";
		String msg2 = "va";
//		concat(msg1, msg2); 
		
		String msg3 = "java";
		System.out.println(msg3 == msg1 + msg2);
		
		String msg5 = "a";
		for (int i = 0; i < 20; i++) {
			msg5 += 1;
		}
		System.out.println(msg5);
	}
}
