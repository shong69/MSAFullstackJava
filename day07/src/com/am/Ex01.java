package com.am;

/** ���� ���� - ���������� �ڷ��� �⺻��
 * @author user
 *
 */
public class Ex01 {
	
	public static String msg= null; //��ü ����, String�� Ŭ���� Ÿ���̴ϱ� �⺻���� null(Ű����μ�) -> �ּҰ��� ���ٴ� �ǹ�
	public static String msg2=""; //��ü ����, item�� ����
	
	public Ex01() { //�⺻ ������ -> �Ű����� �����ڰ� �ִٸ� ������ �� ����
		//��ü ���� X. �����ڰ� �����ڸ� ������ ����
		this("����");
	}
	public Ex01(int su) { //�Ű����� ������
		//��ü ���� X
		this("���� : " + su);
	}
	public Ex01(String msg) { //�Ű����� ������
		//��ü ���� O
		System.out.println("��ü ���� ");
		System.out.println("�Ű����� ");
		System.out.println("���ڿ� : "+msg);
		System.out.println(this);
	}
	
	public static void main(String[] args) {
//		char ch = '\u0000'; //�������� �⺻��==null (���ڷμ� null -> \u0000���� ��µ�)
		Ex01 me = null; //���������� �⺻���� null�� (Ű����μ��� null -> null�̶� ��µ�)
		
		me =new Ex01("java"); //���������� ��ü�� ������ �� (���������� Ÿ���� �׷��� Ŭ������)
		
		

	}
}
