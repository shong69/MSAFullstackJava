package com.am;
class Lec03{
	public int su1 = 111;
	protected int su2 = 2222;
	int su3 = 333;
	private int su4 = 4444;
	
}
/* protected
 * 동일 패키지에서만 접근을 허용(==default)
 * 단, 상속을 통해서만 접근 허용함
 * */
public class Ex03 extends com.am.child.Lec02{
	public static void main(String[] args) {
//		com.am.child.Lec02 par = new com.am.child.Lec02();
		
		Ex03 par = new Ex03();
		System.out.println("public :"+par.su1);
		System.out.println("protected : "+par.su2); // 타패키지 클래스를 상속받아 나 자신 접근 허용
//		System.out.println("default : "+par.su3); 
//		System.out.println("private : "+par.su4); //타 클래스에서 사용 불가
	}
}
