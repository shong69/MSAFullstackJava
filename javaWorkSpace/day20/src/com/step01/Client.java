package com.step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
// 1) 서버 ip 주소 알아내기
// 2) 통신방식 결정
// 3) 포트 설정, 서버 ip로 찾아오는 포트를 감시하고있어야 함
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		java.net.Socket sock;
		
		byte[] arr = {127,0,0,1};
		InetAddress addr;
		int port = 3000;
		OutputStream os = null;
		InputStream is = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			addr = InetAddress.getByAddress(arr);
			sock = new Socket(addr, port);
			is = sock.getInputStream();
			os=sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
						
			while(true) {//특정 단위로 꺼내야 한다.
				String msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();//개행 추가 -> 라인 단위로 읽어내도록
				bw.flush(); //버퍼 밀어냄
				if(msg.contentEquals("exit"))break;
				String result = br.readLine();
				System.out.print(result);
			}
			
			bw.close();
			br.close(); 
			osw.close();
			isr.close();
			is.close();
			os.close();
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
