package com.pm;

public class Ex05 {
	public static void main(String[] args) {
		String msg = "ABCD abcd ABCD";
		String msg2 = new String("ABCD abcd");
		String msg3 = "";
		//���� ���ԵǾ��ִ��� �� �ڷ��� ��ȯ
		boolean isTrue =msg.contains("bc");
		
		//�ؽ� �� ���������� ��ȯ -> �������� ������ �޸� �� X
		int hash = msg.hashCode();
		int hash2 = msg2.hashCode();
		System.out.println(hash == hash2);
		
		//����ִ��� �� �ڷ��� ��ȯ
		boolean isTrue2 = msg.isEmpty();
		
		//�ش� ���ڰ� ��ġ�ϴ� ���� ù��° ��ġ ��ȯ. ������ -1
		int idx = msg.indexOf("BC");
		System.out.println(idx);
		//�ش� ���ڰ� ��ġ�ϴ� �߰� ��ġ
		int idx2= msg.indexOf("BC", 5); //�ι�° �Ű����� fromIndex : ���� �����ϴ� ��ġ
		//�ش� ���ڰ� ��ġ�ϴ� ���� ������ ��ġ ��ȯ
		int idx3 = msg.lastIndexOf("BC");
		System.out.println(idx2);
		
		
		//�ش� �������� �Ű�����1���� �Ű�����2 ������ �ش��ϴ� ����������� charSequence�� ��ȯ
		CharSequence seq = msg.subSequence(0, 5); 
		
		//�Ű������� �� �������� �ڷ������� ���ڿ��� ��ȯ����
		String result = String.valueOf(true);
		System.out.println(result);
		
		
		
		
	}
}
