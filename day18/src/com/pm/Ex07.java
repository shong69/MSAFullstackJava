package com.pm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		File file =  new File("data06.txt");
		
		java.io.Reader fr = null;
		java.io.BufferedReader br = null; //더 빨라짐
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
//				int su = br.read();
//				if(su==-1)break;
//				System.out.print((char)su);
				String msg = br.readLine(); //문자열을 읽을 수 있다.
				if(msg == null) break; //문자열을 다 읽으면 null이 나온다
				System.out.println(msg); //개행을 기준으로 읽기 때문에 개행을 출력하지 않음 -> println으로 출력
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
