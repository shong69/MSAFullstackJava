package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		java.net.DatagramSocket ds = null;
		java.net.DatagramPacket pack = null;
		InetAddress addr = null;
		
		
		try {
			//데이터, 도착지 정보(ip port) 필요
			addr = InetAddress.getByName("127.0.0.1");
			int port = 7080;
			String msg = "hello world";
			
			ds = new DatagramSocket();
			pack = new DatagramPacket(msg.getBytes(), msg.length(), addr,port);
			ds.send(pack);
			
			System.out.println("전송");
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(ds != null) {
				ds.close();
			}
		}
		
		
		

	}
}
