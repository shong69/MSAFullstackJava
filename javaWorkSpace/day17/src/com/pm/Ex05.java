package com.pm;

import java.io.IOException;
import java.io.InputStream;

public class Ex05 {
	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			//엔터 누르기 전까지 출력됨
			System.out.println(is.read()); 
			System.out.println(is.read());// \r
			System.out.println(is.read());// \n
			System.out.println(is.read());
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
