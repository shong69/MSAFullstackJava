package com.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		File file = new File("abcdefg.txt");
		try {
			File file2 = file.createTempFile("AAAAAAAA", "BBBBBBBB");  //AAAAAAAAAabcdefgBBBBBBBBBB로 만들어져야 하지만 중간 파일이름을 해시코드 값으로 생성했다.
			System.out.println(file2.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
