package com.pm;

public class Ex07 {
	public static void main(String[] args) {
		// - 1~45 랜덤 숫자 생성
		// - 값의 치환->배열에 있는 수랑 바꾸라고?
		// - sort 알고리즘->오름차순 정렬하라고..?
//		int su=0;
//		while(true) {
//			//random메서드로 도출되는 수의 빈도수에 대해 알 수 없기 때문에 범위를 넓게 줘본 것임
//			su = (int)(Math.random()*100);   //0~99
//			if(su>0 && su <46) break;
//		}
//		//치환하기 뭐를...?
////		int a= 1111;
////		int b = 2222;
////		int temp = 0;
////		a = b;
////		b = temp;
//		int[]arr = {0,0,0,0,0,0};
//		int temp = 0;
//		
//		
//		
//		//정렬 알고리즘
//		int[] arr1 = {3,2,1};
//		int[] temp2 = {0,0,0};
//		
//		arr[0]=temp2[0];
//		if(arr[0] >temp2[1])arr[0]=temp2[1];
//		if(arr[0] >temp2[2])arr[0]=temp2[2];
//		
//		arr[1] = temp2[1];
//		if(arr[1]>temp2[2]) arr[1] = temp2[2];
//		
//		arr[2] = temp2[2];
		
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
//			0*45 +1 <= ran*45 < 1*45+1
			int temp = (int)(Math.random()*45) +1;
			lotto[i]= temp;
			for(int j = 0;j<i;j++) {
				if(lotto[j]==temp) {
					i--;
					break;
				}
			}
			
					
		}
		for(int i = 0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
