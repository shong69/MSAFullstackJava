package com.pm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {


		// 주민번호 체크기(ver 0.1.0)
		// 주민번호를 입력 > 990629-32165163
		// 당신은 27세 남성입니다.
		
		//주민번호를 입력 > 00121654-6541325
		//당신은 26세 여성입니다.

		//주민번호를 입력 > 00121654-6541325
		//입력 포멧을 다시 확인하세요(000000-0000000)
		
		//주민번호를 입력 > abc121654-6541325
		//숫자만 입력하세요
		
		//번외 : 한글지원
		
		//-> 숫자 여섯자리 + "-" + 숫자 일곱자리 로만 입력받도록
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("주민번호 체크기(ver 0.1.0)");
			System.out.print("주민번호를 입력 >");
			
			String input = sc.nextLine(); 
			
			if(input.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
				return;
			}
			
			// 추가) 한글 지원 기능 :
			/* 규칙이 없는 문자에 규칙을 부여해서 처리하면 된다.
			 * 인덱스와 같은 순서의 한글 숫자를 배열에 넣고
			 * 입력한 문자 배열을  for문에서 돌려서 idx와 일치한다면 한글숫자배열[idx]의 값과 바꿔준다
			 * */
			char[] arr1 = input.toCharArray();
			char[] role= {'영','일','이','삼','사','오','육','칠','팔','구'};
			char[] target = new char[10];
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < role.length; j++) {
					if(arr1[i] == role[j]) {arr1[i] = target[j];}
				}
			}
			
			//arr1 문자 배열을 다시 문자열로 바꿔주기 (미리 만든 메서드 매개변수가 String임ㅜ)
			input = new String(arr1); 
			
			checkSsn(input);
		}

	}
	
	/** 유효성 결과에 따른 메시지 출력
	 * @param input
	 */
	public static void checkSsn(String input) {
		int val = checkVal(input);
		
		if(val == -1) { //숫자 말고 딴것도 입력한 경우
			System.out.println("숫자만 입력하세요.");
		}else if(val== -2) { // 포멧이 맞지 않는 경우
			System.out.println("입력 포멧을 다시 확인하세요(000000-0000000)");
		}else {
			calSexAndAge(input);
		}
		
	}
	
	/** 유효성 확인
	 * @param input
	 * @return
	 */
	public static int checkVal(String input) {
		//총 개수가 14개인지 확인
		if(input.length()!=14) {
			return -2;
		}
		
		//주민번호 8번째가 1,2,3,4가 아닌 숫자인 경우
		int num = input.toCharArray()[7]-'0';

		if(num != 1 && num!=2 && num!= 3 && num!= 4) {
			return -2;
		}
		
		//월과 일 형식 확인
		if(((input.toCharArray()[2]-'0')*10 + (input.toCharArray()[3]-'0'))>12) {
			System.out.println("월을 잘못 입력했습니다.");
			return -2; //12보다 높은 월을 입력했을 때
		}else {
			if(((input.toCharArray()[4]-'0')*10 + (input.toCharArray()[5]-'0'))>31){
				System.out.println("일자를 잘못 입력했습니다.");
				return -2; //31보다 높은 일을 입력했을 때
			}
		}
		
		
		//6번째에 -(대시) 있는지 확인
		//0~5번째, 7~13번째가 숫자인지 확인
		int numVal = 0;
		for (int i = 0; i < input.length(); i++) {
			//6번째 기호가 대시가 아닐 때
			if(i==6 && input.charAt(i)!='-') { return -2;} 
			
			//나머지 영역이 숫자가 아닐 때
			if(i != 6 && (input.charAt(i)-'0'<=0 || input.charAt(i)-'0'>=9)) { 
				numVal = -1;
			}

		}
		return numVal;

	}
	
	/** 나이와 성별 계산하고 출력하기
	 * @param input
	 */
	public static void calSexAndAge(String input) {
		String sex = null;
		int year = LocalDate.now().getYear(); //올해 연도
		int bornYear = 0;
		int age;
		
		//0~1번째가 나이 && 7번째가 2,4일 때 여자 && 1,3일 때 남자
		char[] sexArr = input.toCharArray(); 

		//나이 계산하기
		if(sexArr[7]=='3' || sexArr[7]=='4') {//2000년대생인 경우
			bornYear = 2000 + (sexArr[0]-'0')*10 + (sexArr[1]-'0');
			
		}else if(sexArr[7]=='1' || sexArr[7]=='2'){ //그 이전인 경우
			bornYear = 1900 + (sexArr[0]-'0')*10 + (sexArr[1]-'0'); 
		}
		
		age = year - bornYear + 1; //한국나이로
		
		//성별 가려내기
		if(sexArr[7]=='1' || sexArr[7]=='3') { 
			sex = "남성";
		}else if(sexArr[7]=='2' || sexArr[7]=='4') {
			sex = "여성";
		}
		
		System.out.printf("당신은 %d세 %s입니다.\n", age, sex);
		
	}
	

}
