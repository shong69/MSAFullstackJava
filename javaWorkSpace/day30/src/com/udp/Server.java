package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
	public static void main(String[] args) {
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		byte[] buf = new byte[11];
		try {
			//서버에서는 목적지에 대한 정보를 가지고 있지 않음 -> 소켓이 목적지 정보를 받아들이도록 한다.
			//port 정보를 소켓의 생성자에부여해야함
			sock = new DatagramSocket(7080);
			//데이터를 받아낼 공간 buffer와 buffer의 길이를 받는다.
			pack = new DatagramPacket(buf, buf.length); 
			sock.receive(pack);
			
			System.out.println(new String(buf));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock!= null)sock.close();
		}
		
	}
}
