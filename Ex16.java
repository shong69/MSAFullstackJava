/*
메서드(클래스 메서드)
문법 : [public static 리턴 타입 메서드명(매개변수){실행문; [return]}]

1. 클래스의 구성요소이므로, 반드시 클래스 안에 있어야 한다.
2. 생성과 호출이 필요하다.
3. 메서드명의 중복은 불가능하다.
4. 메서드 명의 명명규칙은 네이밍 규칙과 동일하다(소문자로 시작, 특수문자 불가, 대소문자 구분, 카멜케이스)
5. 매개변수의 의의 : 호출 시 값을 전달한다. (단 반드시 타입과 개수가 일치해야 함)
6. 모든 메서드는 리턴이 존재(생략시 메서드 끝에 자동으로 붙음)
7. 메서드는 리턴 값을 갖을 수 있다. 이 경우  void 대신 자료형을 명시한다.



*/

class Ex16{
public static void main(String[] args){ //main 메서드
	System.out.println("before...");
	//if(true) return; //jdk 환경에 따라 오류가 나기도, 안나기도 하는 조건문. 
			//필요없는 조건문이기 때문에 이를 챙기느냐 마느냐에 따라 if문을 확인하면 오류가 나고, 안하면 오류가 안나게됨
	func01(5);
	func03();

	for(int a =0;a<9;a++){
		gugudan(a+1);
	}
	System.out.println("after...");
} //main end

/*
매개변수 사용해보기
*/
public static void func01(int a){ //메서드
	for(int i = 0;i<a;i++){
	System.out.println("func01 실행");
	}

} //func01 end

/*
메서드에서 메서드 호출하기
*/
public static void func02() { //리턴 타입 void : 반환 값이 없다
	System.out.println("func02 실행");
	int val = 3;
	if(val>0) return;
	func03(); //실행 안됨
} //func02 end


public static int func03(){ //리턴 타입 int
	System.out.println("func3 실행");
	return 1234; // return 값이 없을 때는 생략할 수 있음
}

//매개변수의 개수와 타입의 차이를 통한 중복을 허용한다.
//public static void func04(String a, int a){}
//public static void func04(int a){}


//구구단 메서드 만들어서 다른 클래스에서 호출하기
public static void gugudan(int a){
	//main에서 이렇게 호출 중
	//	for(int a =0;a<9;a++){
	//	gugudan(a+1);
	//}

	System.out.println(2+" X "+a + " = " + 2*a+"\t"+3+" X "+a + " = " + 3*a);
	a= 11; //중복되는 변수명인 a를 메서드 안에서 11로 바꾼다면 어떻게 실행될까? 
	       //변수의 라이프 사이클이 존재한다.
}
} //class end

