package com.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) {
		File target = new File("dum.jpeg");
		File copy = new File("copy01.jpg");
		
		if(!copy.exists()) {
			try {
				copy.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			is = new FileInputStream(target);
			os = new FileOutputStream(copy);
			
			//사진 복사하기
//			for (int i = 0; i < target.length(); i++) {//target의 길이만큼 반복
			while(true) {
				int su = is.read();
				if(su==-1)break;
				os.write(su);
			}
			System.out.println("복사완료");
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
