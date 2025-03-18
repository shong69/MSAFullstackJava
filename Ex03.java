class Ex03 {
public static void main(String[] args) {

	//********문자의 사용****************
	System.out.println('a');
	System.out.println('\uac00'); //가
	
	char ch1;
	ch1= '\uac01'; //각
	System.out.println(ch1);

	char ch2 = 65;
	System.out.println(ch2);
	System.out.println(ch1 + ch2);
	
	
	System.out.println("문자" + "열"); //문자열과 문자열을 더했기 때문에 그대로 에러 없이 문자열이 출력된다.
	
	System.out.println("문자" + '열'); //그대로 문자열됨
	System.out.println("문자" + 123); //숫자도 문자열 됨
	
	
	//********문자열의 사용****************
	String msg;
	msg = "문자열";
	System.out.println(msg);
	
	System.out.println(2024 + 1 + "년");
	System.out.println("year"  + 2024 + 1);
	
	System.out.println('5' + 1);
	
	//********역슬래쉬의 사용****************
	System.out.println("ABCSCSK\babcd");
	System.out.println("ABCD\babcd");
	
	System.out.println("\\\\"); // \\출력됨
	System.out.println("http:\\\\naver.com"); // http:\\naver.com
	
	System.out.println("ABCD\"ab\"cd"); //ABCD"ab"cd
	
	System.out.println("ABCD\nabcd");//ABCD
								//abcd
	System.out.println("ABCD\r\nabcd");//ABCD
								//abcd
								
	System.out.println("ABCD\u0009aabcd"); //ABCD    aabcd
	
	//********진수를 바꿔 사용****************
	
	int su1 = 0xac00;
	System.out.println("16진수  ac00 = "+ su1); //16진수  ac00 = 44032
	
	int su2 = 010;
	System.out.println("8진수 010 = "+ su2); //8진수 010 = 8
	
	
}
}