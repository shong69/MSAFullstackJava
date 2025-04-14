package com.am;

import java.io.File;

public class Ex08 {
	public static void main(String[] args) {
		File file = new File("target.txt"); //객체 잡고
		File result = new File("target2.txt"); //없는 객체 잡아서
		boolean boo = file.renameTo(result); //이름 바꾸기
		System.out.println(boo);
	}
}
