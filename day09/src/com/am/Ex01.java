package com.am;
/* �߻� Ŭ����
 * - �߻� �޼��带 0�� �̻� ���� Ŭ����
 * - ����� ���ؼ��� ������� �����ϴ� Ŭ����
 * */
abstract class Lec01{
	static int su1 = 1111;
	int su2 = 2222;

	public Lec01(String msg) {
		System.out.println("������ ȣ��");
	}
	
	//����� ���� ����(���� ��Ű�������� ��� ���)
	protected Lec01() {}
	Lec01(int s) {} 
	//�߻� �޼���
	// �޼����� ���� O, �޼����� ���� X
	public void func01() {}
	public static void func03() {}
//	public abstract static void fun04(); -> �Ұ��� 
//	static�� �÷����� �̸� �����ؾ� �ϴµ� �����ΰ� �������� �ʰ� �ִ�
	

}
public  class Ex01 extends Lec01{
	public Ex01(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Lec01 parent = new Lec01();
		Ex01 me = new Ex01("�޽���"); //�ڽ� ��ü�� ���� �θ�ü�� �⺻�����ڵ� ���� �� ����
		//�θ� Ŭ������ �⺻ �����ڰ� �������� �ʴ� ��� ���� -> �� �����ڿ��� �θ�Ŭ������ �����ڸ� ȣ��
	}
}
