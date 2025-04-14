package com.pm;

public class Ex01 {
	
	public static String uppercase(String msg) {
		char[] arr1 = msg.toCharArray(); //문자 배열로 변환
		int gap = 'a' - 'A';
		for (int j = 0; j < arr1.length; j++) {
			arr1[j] += gap;
		}
		return new String(arr1);
	}
	public static void upperCase2(String msg) {
		//소문자인지 검증하기
		int alpNum = 'z'-'a'+1; //25

		char[] arr = msg.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>=97 && arr[i]<=97+alpNum) { //a보다 크거나 z보다 작을때
				
				System.out.print((char)(arr[i]-32));
			}
		}

	}
	/**concat() 함수 기능 구현하기
	 * @param msg1
	 * @param msg2
	 * @return
	 */
	public static void concat(String msg1, String msg2) {
//		String result2 = str1.concat(str2); //이거랑 동일한 결과가 나오도록 하기
		
		int len1 = msg1.toCharArray().length;
		int len2 = msg2.toCharArray().length;
		char[] result3 = new char[len1+len2]; //배열 개수는 0부터 세지 않는다

//		for (int i = 0; i < result3.length/2; i++) { 
//			result3[i] = str1.charAt(i);
//			result3[i+result3.length/2] = str2.charAt(i);
//
//		} //같은 수의 문자열을 합치는 경우에만 가능함
		
		for (int i = 0; i < result3.length; i++) {
			if(i<len1) {
				result3[i] = msg1.charAt(i);
			}else {
				result3[i] = msg2.charAt(i-len1); //인덱스 - 배열1의 길이의 위치 값을 대입
			}
		} //문자열의 개수와 상관없이 합칠 수 있음
		System.out.println(new String(result3)); //메소드 호출할 때마다 새로운 객체로 리턴
	}
	
	
	
	public static void main(String[] args) {
		//toUpperCase() 메서드 구현해보기
//		String msg = "java";
//		char[] msg2=new char[msg.length()];
//		for (int j = 0; j < msg.length(); j++) {
//			msg2[j] = (char) (msg.charAt(j)-32);
//			System.out.println((char) (msg.charAt(j)-32));
//		}
//		String result = new String(msg2);
//		System.out.println(result);
		
		//------------------------------------
		//메서드 생성해서 출력해보기
//		String msgs = "java";
//		
//		String result1 = uppercase(msgs);
//		System.out.println(result1);
//		System.out.println(msgs.toUpperCase());
		
		//유효성 검증해보기
		//-> 소문자만 대문자로 입력하도록
//		upperCase2("java");
		
		//----------------------------------
		String msg1 = "ja";
		String msg2 = "va";
//		concat(msg1, msg2); 
		
		String msg3 = "java";
		System.out.println(msg3 == msg1 + msg2);
		
		String msg5 = "a";
		for (int i = 0; i < 20; i++) {
			msg5 += 1;
		}
		System.out.println(msg5);
	}
}
