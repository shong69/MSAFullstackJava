package com.am;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		//파일 - 디렉토리 & 파일
		
		//상대경로
		//지금 이 파일 기준으로 위치 -> 주소 넘겼을 때 파일 인식 X
//		File file = new File("target.txt");
		File file = new File("..\\day17"); 
		
		//절대경로
		//D:\javaWorkspace\day17\src\com\am...
//		File file = new File("D:\\javaWorkspace\\day17\\target.txt");
		
		//.\ : 지금 나의 위치
		//
		System.out.println("파일이 존재하는가?"+file.exists()); //true
		System.out.println("디렉토리인가?"+file.isDirectory()); //false
		System.out.println("파일인가?"+file.isFile()); //true
		
		System.out.println("path?"+file.getPath()); //경로 + 파일명
		System.out.println("경로?"+file.getParent()); //경로
		System.out.println("파일명?"+file.getName()); //target.txt
		//절대경로인데 D:\javaWorkspace\day17\..\day17로 표현됨
		System.out.println("절대경로?"+file.getAbsolutePath()); 
		//완벽한 절대경로 D:\javaWorkspace\day17
		System.out.println("절대경로?"+file.getCanonicalPath()); 
		
		//-------------------------------------------------------
		System.out.println(file.canWrite()); //rwx를 나타냄
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		//개인용 컴퓨터를 표방하는 윈도우 체제라 rwx가 true로 세팅되어있지만, 
		//개인이 아닌 다수가 사용할 수 있다는 점에서 문제가 됨
		
		//------------------------------------------------------
		//날짜
		System.out.println(new Date(file.lastModified()));//파일 마지막 수정일 long타입
		String[] list = file.list(); //디렉토리의 목록
		System.out.println(Arrays.toString(list));
		
		//---------------------------------------------------
		System.out.println("-----------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		int fileNum = 0;
		int fileSize = 0;
		int dirNum = 0;
		int dirSize = 0;
		for(int i = 0;i<file.listFiles().length;i++) {
			System.out.print(sdf.format(file.listFiles()[i].lastModified())+"\t");
			if(file.listFiles()[i].isFile()) {
				System.out.print("\t"+file.listFiles()[i].length());
				fileSize += file.listFiles()[i].length();
				fileNum++;
			}else {
				System.out.print("<DIR>\t");
				dirSize += file.listFiles()[i].length();
				dirNum++;
			}
			System.out.println("\t"+file.listFiles()[i].getName());
		}
		System.out.printf("\t\t%d개 파일  %d바이트\n",fileNum,fileSize);
		System.out.printf("\t\t%d개 디렉터리  XX바이트\n",dirNum);
	}
}
