package com.am;
class Lec03{
	public int su1 = 111;
	protected int su2 = 2222;
	int su3 = 333;
	private int su4 = 4444;
	
}
/* protected
 * ���� ��Ű�������� ������ ���(==default)
 * ��, ����� ���ؼ��� ���� �����
 * */
public class Ex03 extends com.am.child.Lec02{
	public static void main(String[] args) {
//		com.am.child.Lec02 par = new com.am.child.Lec02();
		
		Ex03 par = new Ex03();
		System.out.println("public :"+par.su1);
		System.out.println("protected : "+par.su2); // Ÿ��Ű�� Ŭ������ ��ӹ޾� �� �ڽ� ���� ���
//		System.out.println("default : "+par.su3); 
//		System.out.println("private : "+par.su4); //Ÿ Ŭ�������� ��� �Ұ�
	}
}
