package com.pm;

//Ŭ������ �������
//1. �޼���
//   : ��ü�� ����� �����
//2. ����
//   : ��ü�� �Ӽ��� ǥ����

//   ���� ������ ����
//   -> ����� �ʱ�ȭ�� ���ÿ� �����ؾ� �� (��, �ڵ� �� ���� ������ ��� ����. 
//											�� ��� ����Ʈ ��(0)���� �ʱ�ȭ�ȴ�.)
//   2-1 Ŭ���� ����(static)
//   2-2 ��� �ʵ� (non-static)

// static -> static : [��Ű�� ���].[Ŭ������].������;
// static -> non-static : ��������.������
// non-static -> static : [��Ű�� ���].[Ŭ������].������;
// non-static -> non-static : [this.]������;

public class Ex09 {
	public static int su1 = 1111;
	public int su2 = 2222;
//	public static int su3; -> ����� �ʱ�ȭ�� ���ÿ� �ϴ°� �Ұ�����
//	su3 = 3333;
	public static void main(String[] args) {
		System.out.println(com.pm.Ex09.su1);
		
		Ex09 me = new Ex09();
		System.out.println(me.su2); //non-static�� Ŭ������ü�� ���� �� ���������� ����� ���
	}
	
	
}
