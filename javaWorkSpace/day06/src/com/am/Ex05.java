package com.am;

public class Ex05 {
	public static void main(String[] args) {
//		 배열
//		 자료형[] 변수명= new 자료형[갯수]; 선언과 초기화
//		 변수명[idx]
//		 다중의 값을 담을 수 있다.
//		 단, 자료형이 동일한 다중의 값을 담아야 한다.
//		 값을 담을 때 해당 인덱스를 누락시 자료형의 디폴트 값을 갖는다
		
//		 배열의 인덱스
//		 0부터 시작해서 연속된 숫자로 센다.
//		 마지막 인덱스는 개수-1과 같다
		
		
		int[] arr1 = new int[] {2,4,6,8}; //선언과 초기화 동시에 함 -> 갯수 선언 X
		int[] arr2 = new int [4];
		int [] arr3 = {2,4,6,8}; //가능은 하지만 비추(RowMapper에서 오류남)
		
		System.out.println(arr3.length); //length : 배열의 길이, length() : 문자열의 길이
//		arr[0] = 2;
//		arr[1] = 4;
//		arr[2] = 6;
//		arr[3] = 8;


//		for (int i = 0; i < 4; i++) {
//			arr1[i] = 2*(i+1);
//
//		}
//		for (int i = 0; i < 4; i++) {
//			System.out.println(arr1[0]);
//
//		}

		
		
		
	}
}
