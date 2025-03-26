package com.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String msg = "hello java";
		File file = new File("data01.bin");
		if(!file.canExecute()) { //파일이 실행되지 않으면
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			java.io.OutputStream os = null;
			
			try {
				os = new java.io.FileOutputStream(file); //덮어쓰기 된다.
				
				for (int i = 0; i < msg.length(); i++) {
					os.write(msg.charAt(i));
				}
//				os.write('A');
				os.write(300);
				os.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
