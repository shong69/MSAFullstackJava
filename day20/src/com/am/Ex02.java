package com.am;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		String msg = "https://www.google.com/search?q=%EB%8F%84%EB%A9%94%EC%9D%B8+%EA%B5%AC%EB%A7%A4&sca_esv=034baad0715ecaf6&ei=BAnqZ6DbJO7Evr0PwJTwiAU&ved=0ahUKEwig7enArbOMAxVuoq8BHUAKHFEQ4dUDCBA&uact=5&oq=%EB%8F%84%EB%A9%94%EC%9D%B8+%EA%B5%AC%EB%A7%A4&gs_lp=Egxnd3Mtd2l6LXNlcnAiEOuPhOuplOyduCDqtazrp6QyChAAGIAEGEMYigUyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgARI8wVQgwRY9wRwAXgBkAEAmAFroAHVAaoBAzAuMrgBA8gBAPgBAZgCA6AC7AHCAgoQABiwAxjWBBhHmAMAiAYBkAYKkgcDMS4yoAeJCw&sclient=gws-wiz-serp";
		//한글 검색어는 엔코딩되어 보이지 않는 것이다.
		
//		String msg = "https://getbootstrap.com/docs/3.4/css/#buttons"; -> getRef()시 button이 뜸
		java.net.URL url = null;
		try {
			url = new URL(msg);
			System.out.println(url.getProtocol()); //https 통신방식
			System.out.println(url.getHost()); //www.google.com 도메인 -> ip
			System.out.println(url.getDefaultPort()); //port번호를 따로 명세하지 않으면 defaultPort로 찾는다
													//443(https) / 80(http)
			System.out.println(url.getPath()); ///search 검색어 파라미터 전까지 주소, 요청 경로 및 파일명
			System.out.println(url.getQuery()); //검색한 부분  key=val 쌍의 요청 정보
			System.out.println(url.getRef()); //주소의 anchor(reference)를 알려줌
			//url 의 구조 나타냄
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
