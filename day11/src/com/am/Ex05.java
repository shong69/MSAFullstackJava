package com.am;

interface Parent{ //상속을 통해서 변수의 라이프사이클을 벗어날 수 있다. + 호출을 외부에서 가능하도록 함
	void func02();
}
class Lec05{
	static Parent par1 = new Parent() {
		public void func02() {
			System.out.println("내부 클래스의 기능 수행");
		}
	};
	Parent par2=new Parent(){
		public void func02() {
			System.out.println("내부클래스의 기능수행");
		}
	};
//		class Local implements Parent{ //1/ func02()를 가진 부모(interface)를 상속받아서
//			public void func02() {
//				System.out.println("내부 클래스의 기능 수행");
//			}
//		}
//클로져 : jdk1.8에 생성됨 : 주변 상태에 대한 참조와 함께 포함된 함수의 조합 -> 외부 함수의 맥락에 접근 가능
	static Parent func01() {
		//익명 클래스
//		local.func02();
		Parent local= new Parent(){ //1/ func02()를 가진 부모(interface)를 상속받아서
			public void func02() {
				System.out.println("내부 클래스의 기능 수행");
			}
		};
		
		Parent local2=()->System.out.println("람다식");
		
		return local2;
	}

}
public class Ex05 {
	public static void main(String[] args) {
		
		//익명 클래스
		Parent local = Lec05.func01();
		local.func02(); //2. 외부에서 func01과 func02 호출을 동시에 가능하게 함
		
//		Lec05.par1.func02();
	}
}
