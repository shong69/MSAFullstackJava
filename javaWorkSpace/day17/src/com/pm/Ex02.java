package com.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("data01.bin");
		java.io.InputStream is = null;
		if(file.exists()) {
			try {
				is =  new java.io.FileInputStream(file);
				int su = -1;
				while((su=is.read())!=-1) { //다 읽으면 끝에 -1이 나온다(binary data이기 때문에 음수 없어서 -1 씀)
					System.out.println((char)su);
				}
				is.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
