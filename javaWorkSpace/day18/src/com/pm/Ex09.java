package com.pm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex09 {
	public static void main(String[] args) {
		File file = new File("data09.txt");
		
		//OutputStream만 제공받는다고 가정할 때
		OutputStream os = null;
		OutputStreamWriter osw = null; //Writer와 동일한 방식
		BufferedWriter bw = null;
		try {
			file.createNewFile();
			os = new FileOutputStream(file);
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
//			osw.write('한');  //Writer 쓰는 것과 동일함
//			osw.write('글');
			
			bw.write("문자열로 작성");
			bw.newLine();
			bw.write("다음줄");
			
			bw.close();
			osw.close();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
