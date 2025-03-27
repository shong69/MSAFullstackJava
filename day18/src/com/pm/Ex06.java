package com.pm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Ex06 {
	public static void main(String[] args) {
		File file = new File("data06.txt");
		
		java.io.Writer fw = null;
//		OutputStream os = null;
		java.io.BufferedWriter bw = null; //속도 향상
		try {
			file.createNewFile();
			fw = new FileWriter(file); //writer을 파일에 사용할 때
			bw = new BufferedWriter(fw);
//			os = new FileOutputStream(file);
//			os.write('A');//1바이트
//			os.write('한'); //3바이트 ->이 중 1바이트만 가져간다.
//			
//			bw.write('A'); 
//			bw.write('한'); //3바이트인 한글도 잘 가져가서 쓰인다.
			bw.write("hello world");//버퍼이기 때문에 문자열을 한번에 가져갈 수 있다.
			bw.newLine(); //개행
			
			bw.close();
			fw.close();
//			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
