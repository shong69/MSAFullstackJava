package com.step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 1) ip : 서버에서는 ip를 찾을 필요 X
// 2) 통신방식 결정
// 3) 포트 설정, 서버 ip로 찾아오는 포트를 감시하고있어야 함
public class Server {
	public static void main(String[] args) {
		java.net.ServerSocket server=null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw= null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			server = new ServerSocket(3000);
			socket = server.accept(); 
			is = socket.getInputStream();
			os = socket.getOutputStream();
			isr= new InputStreamReader(is);
			osw= new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
//			osw.write("re:");
//			while(true) {
//				int su = isr.read();
//				if(su=='\n') break; //읽는 내용의 끝이 없는 상황이라 -1로 확인하지 말고 스페이스로 확인한다.
//				osw.write(su);
//			}
			
			while(true) {
				String msg = br.readLine(); //라인 단위로 읽어드림
				if(msg.equals("exit")) break;
				msg = "re:"+msg; //client가 re:내용 형태로 반환하도록
				bw.write(msg);
				bw.newLine();
				bw.flush(); //버퍼를 다 채우지 않아도 밀어내도록 함
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//객체 닫기
			//반드시 실행 보장
			try {
				if(br != null)br.close();
				if(bw != null)bw.close();
				if(osw != null)osw.close();
				if(isr != null)isr.close();
				if(os != null)os.close();
				if(is != null)is.close();
				if(socket != null)socket.close();
				if(server != null)server.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
}
