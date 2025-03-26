package com.am;

import java.io.File;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File(".\\dir01\\dir02"); //현재 디렉토리에 dir01 만들고 그 아래에 dir02만들기
		
		boolean result  =file.mkdir();
		System.out.println(result);
	}
}
