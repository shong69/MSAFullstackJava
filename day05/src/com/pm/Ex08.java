package com.pm;

public class Ex08 {

	public static void main(String[] args) {
		
		//�޼��� - �Լ�
		
		//1. Ŭ���� �޼���(static �޼���, �Լ�) : �޸��� static ����
		// static ���� - ��Ű�� ���.Ŭ������.�޼����
		//public static ����Ÿ��(void) �޼����(�Ű�����){����;} 
		
		//2. �ν��Ͻ� �޼���(non-static �޼���, ��� �޼���) : �޸��� heap ����
		//heap ���� - ��ü�� ����
		//public ����Ÿ��(void) �޼����(�Ű�����) {����;}
		
		
		// static -> static : [��Ű�� ���].[Ŭ������].func01();
		// static -> non-static : ��������.func01();
		// non-static -> static : [��Ű�� ���].[Ŭ������].func01();
		// non-static -> non-static : [this.]func01();

	}

}
