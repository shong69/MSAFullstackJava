package com.am;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		//1~45
		//0.0<=Math.random<1.0
		//0.0*45<=Math.random*45<=0.999999999999...*45
		//0.0<=Math.random*45<44.999999...
		//1.0<=Math.random*45+1<45.999999...
		
		System.out.println((int)(Math.random()*45)+1);
		
		Random ran = new Random(); //��ü ����
		//�ڷ����� �´� ���� ������ ������ ������ ��ȯ�ȴ�.
		System.out.println(ran.nextInt()); 
		System.out.println(ran.nextDouble()); //0<=n<1 (Math.random�� ���� ����)
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextLong());
		
		System.out.println("---------------------------------------------------------");
		System.out.println(ran.nextInt(3)); //3�̳��� ���� �������� ���ָ� ��
		System.out.println(ran.nextInt(45)+1); //1~45 ���� ���´�
	}
}
