package com.am;

//�������̽�
//���� �߻�޼��常�� ����
interface Inter01{
	public static int su1 = 111; //static ������ ���� �� ����
	int su2 = 2222; //public static ������
	public abstract void func01() ;
	public void func02() ; //abstract Ű���� ���� ����
	void func03(); //public Ű���� ���� ����
}

interface Inter02{
	void func01();
}
interface Inter03{
	void func02();
}

public class Ex04 extends Object implements Inter02, Inter03{ 
	//���� �޼��带 ���� �������̽����� ����ص� ���� X
	public static void main(String[] args) {
		Ex04 me = new Ex04();
		me.func01();
		Object me2 = new Ex04();
//		me2.func01(); ȣ�� �Ұ�
		Inter02 me3 = new Ex04();
		me3.func01();
//		me3.func02(); �Ұ��� - Inter02�� ��ü ��������ϱ�
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}
}
