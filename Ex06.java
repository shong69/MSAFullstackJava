class Ex06{
public static void main(String[] args){
int a;
a = 1;
double b;
b =3.14;
char ch = '@';
boolean boo = true;

System.out.println("default 정수타입 : " + a);
System.out.println("default 정수타입 : " + b);
System.out.println("default 정수타입 : " + ch);
System.out.println("default 정수타입 : " + boo);

System.out.println("10진수 정수 ");
byte e = 1; //-128~127 까지 가능한 자료형
short f = 1;
long g = 1L; //long(8byte)이기 때문에 int(4byte)표현이 되고 있을 때 L로 지정해주기 (byte와short는 자료형 지정 안해도 되도록 빼줌)


System.out.println("10진수 실수");
float h = 3.14f; //뒤에 있는 상수의 자료형이 double(8byte)인데 float(4byte)에 쓰고 있어서 f로 자료형 지정이 필요함
double i = 23.435436;

//----------
byte val = 127;
//val = val + 1; // 오류 발생 byte는 -128~127까지 가능

//다른 형태 간의 값 대입 시 오류 발생
short val3 = 129;
byte val4;
//val4 = val3; //오류 발생 -> 강제 타입 변환 시켜야 함
val4 = (byte)val3; //short인 val3을 byte로 형 변환 -> 표현범위가 넘쳐서 잘릴 가능성을 감수하고 바꿔야 한다.


//---------숫자 형변환 byte와 short

float val5 = 0.1F;
System.out.println("128->"+val4); //val4 는 byte인 129 -> 양수인 127 표현 범위를 넘었기 때문에 -127로 나온다

//---------숫자 형변환 int와 long
System.out.println((int)2147483647L);//2147483647 //long 타입을 int로 강제 형변환
System.out.println((int)2147483648L);//-2147483648 출력 //int의 표현범위 넘쳐서 음수 표현됨
System.out.println((long)2147483648L); //int의 표현범위를 넘어섰기 때문에 long타입으로 지정하면 제대로 된 수 나옴



//-------문자 형변환

System.out.println((char)65); //A 출력
System.out.println((int)'a'); //65 출력

short su1 = 65;
char ch2 = 'a';
//ch2 = su1; 에러남. short와 char의 표현 범위가 다르다.(int>short>char)
int su2 = 65;
su2 = ch2; //97 출력된다. 자동형변환됨

ch2 = 66; // short인 숫자 66을 대입했을 때는 오류가 나지만 수를 직접 char에 대입한 경우 출력이 된다. 
	// 수를 완벽하게 int 혹은 short로 명세하면 안되는 것임. 

System.out.println("********연산*********");

**
*실수 + 정수 연산을 해도 오토 캐스팅으로 실수로 계산되어 출력된다.
*실수로 연산되는 경우는 알게모르게 자주 일어남. like 5/2가 5/2.0으로 되는 것처럼
**

System.out.println(1+1.0); //2.0 출력






}
}