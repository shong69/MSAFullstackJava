package com.pm;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yy�� MM�� dd�� HH:mm:ss�Դϴ�.");
//		sdf.applyPattern("yy�� mm�� dd�� HH:mm:ss"); applyPattern ���� ���� ���� ����
		String msg = sdf.format(d);
		System.out.println(msg);
		
		int won = 1000000;
		NumberFormat nf =DecimalFormat.getInstance();
		DecimalFormat df = new DecimalFormat("$ ###,000,000.00"); //1,000,000.00 -> # ������ ���� �ִ� ��츸 ���
		String msg2 = df.format(won);
		System.out.println(msg2);
	}
}
