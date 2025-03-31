package com.am;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		java.net.InetAddress addrs[];
		byte[] arr1 = {(byte)127,30,1,(byte)254};  //byte -128 ~ 127
		
		try {
////			addr=  InetAddress.getByName("google.com");
//			addr=  InetAddress.getByName("localhost");
////			addr = InetAddress.getByAddress(arr1);
//			System.out.println(addr.getHostName()); 
//			System.out.println(addr.getHostAddress()); //127.0.0.1 -> 내 ip 주소를 이미 알고 있다는 의미
			addrs = InetAddress.getAllByName("google.com");
			for (int i = 0; i < addrs.length; i++) {
				InetAddress addr = addrs[i];
				System.out.println(addr.getHostName());
				System.out.println(addr.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
