package com.step02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	Socket sock; 
	public Server(Socket sock) {
		this.sock = sock;
	}
	public static void main(String[] args) {
		ServerSocket serve = null;
		
		try {
			serve = new ServerSocket(3000);
			while(true) {
				Socket sock = serve.accept(); //메인 스레드에서 접속 연결된 소켓들을 반환해준다.
				InetAddress addr = sock.getInetAddress();
				String ip = addr.getHostAddress();
				System.out.println(ip+"가 접속하셨습니다.");
				Server me = new Server(sock); //생성자 주입으로 생성
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(serve != null) serve.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	//thread 돌리기
	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw= null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			sock.getInputStream();
			sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				if(msg.equals("exit")) break;
				bw.write("re:"+msg);
				bw.newLine(); //개행
				bw.flush(); //버퍼 차지 않아도 보내줌
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//객체 닫기
			//반드시 실행 보장
			try {
				if(br != null)br.close();
				if(bw != null)bw.close();
				if(osw != null)osw.close();
				if(isr != null)isr.close();
				if(os != null)os.close();
				if(is != null)is.close();
				if(sock != null)sock.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
}
