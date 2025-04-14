/*
순서로 스택 영역에 쌓이게 된다.
func4()
func3()
func2()
func1()
main()
*/

class Ex18{
public static void func1(){
	func2();
}
public static void main(String[] args){
	func1();
}

public static void func2(){
	func3();
}

public static void func3(){
	func4();
}
}