package com.pm;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yy년 MM월 dd일 HH:mm:ss입니다.");
//		sdf.applyPattern("yy년 mm월 dd일 HH:mm:ss"); applyPattern 으로 형식 적용 가능
		String msg = sdf.format(d);
		System.out.println(msg);
		
		int won = 1000000;
		NumberFormat nf =DecimalFormat.getInstance();
		DecimalFormat df = new DecimalFormat("$ ###,000,000.00"); //1,000,000.00 -> # 넣으면 값이 있는 경우만 출력
		String msg2 = df.format(won);
		System.out.println(msg2);
	}
}
