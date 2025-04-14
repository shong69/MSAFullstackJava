package com.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	//Filter Stream
	public static void main(String[] args) {
		File file = new File("dum.jpeg");
		File copy = new File("copy.jpg");
		
		InputStream is = null;
		OutputStream os = null;
		
		//addsfunctionality to another input stream-namely,
		//the ability to buffer the input and tosupport the mark and resetmethods
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[2]; //홀수일 때 의미 없는 수 하나 포함됨
		try {
			copy.createNewFile();
			is  = new FileInputStream(file);
			os = new FileOutputStream(copy);
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			long before = System.currentTimeMillis();
			long cnt = 0;
			while(true) {
				int su = bis.read(buf);
				if(su==-1)break;
				bos.write(buf,0,su); //유효한 수까지만 읽어들이도록 한다.
				cnt++;
			}
			System.out.println(cnt);
			long after = System.currentTimeMillis();
			System.out.println("복사끝 "+(after-before)+"ms");
			bis.close();
			bos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}


	}
}
