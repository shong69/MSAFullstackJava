package com.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		String format = "yyyy-MM-dd  a HH:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String target = ".";
		if(args.length==1) {
			target=args[0];
		}
		File file = new File(target);

		if(file.exists()&&file.isDirectory()) {
			String[] arr = file.list();
			for (int i = 0; i < arr.length; i++) {
				File child = new File(target+"\\"+arr[i]);//현재 파일 위치 아래에 있음을 명시
				

				long before = child.lastModified();
				Date after = new Date(before);

				System.out.print(sdf.format(after)+"\t");
				
				if(child.isDirectory()) {
					System.out.print("<DIR>\t");
				}else {
					System.out.print("\t"+child.length());
				}
				System.out.println("\t"+child.getName());
			}
		}else {
			System.out.println("잘못된 경로입니다.");
		}
	}
}
