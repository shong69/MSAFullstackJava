package com.am;

class Outter04{
	
	static int su3 =3000;
	int su4 = 4000;
	
	//부모에서 중복되는 변수 가질 수 있음
	public final static int su01 = 1000;//final 선언 시 가능
	public int su02 = 2000;
	
	static void func03() {}
	void func04() {}
	//local class : ~jdk1.7 이하에서는 반드시 final, jdk1.8 이상에서는 final 생략 가능함
	static void func01(final int su05) {
//		int su05 = 5555; //final 내부에서 변경 불가
//		su05++;
		
		class Local01{ //접근제한자 X			
//			static int su01 = 1111;//static 선언 불가
			public final static int su01 = 1111;//final 선언 시 가능
			public int su02 = 2222;
			public void func01() {
				
				System.out.println(Outter04.su01); //부모 클래스의 변수 출력
				System.out.println(new Outter04().su02); //부모 클래스의 변수 출력
				System.out.println(Local01.su01); //로컬 클래스의 변수 출력
				System.out.println(this.su02);
				
				func02();
				func03();
				Outter04 outt = new Outter04();
				outt.func04();
//				System.out.println(su05);
			}
			public void func02(){}
			
		}
		

		System.out.println(su05);
		
		Local01 loc = new Local01(); //내부에서 호출 가능 (외부 불가)
		System.out.println(Local01.su01);
		System.out.println(loc.su02);
		loc.func01();
	}
	
	
	void func02() {
		Outter04 outt = this; 
		class Local02{ //접근 제한자 X
			public final static int su01 = 1111;//final 선언 시 가능
			public int su02 = 2222;
			public void func01() {
				
				System.out.println(Local02.su01); 
				System.out.println(this.su02); 
				System.out.println(Outter04.su01); 
				System.out.println(outt.su02); 
				
				func02();
				func03();
				func04();
			}//동일
		}
	}
}

public class Ex04 {
	public static void main(String[] args) {
		new Outter04().func02();
//		Outter04.func01(1111); //여러 수를 final 매개변수로 넣을 수 있다.
//		Outter04.func01(5555); 
	}
}
