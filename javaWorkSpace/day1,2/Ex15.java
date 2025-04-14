/*
* 1. A~Z까지 출력하시오
* 2. 다음을 출력하시오
*   A(a),B(b),C(c),D(d),...,Z(z)
* 3. 다음을 출력하시오
*   1 2 3
*   4 5 6
*   7 8 9
* 4. 다음을 출력하시오
*   1 2 3 
*   2 3 4
*   3 4 5
* 5. 다음을 출력하시오
*   A B C
*   D E F
*   G H I
*/

class Ex15{
public static void main(String[] args){

// 1. 
for(int i = 0; i<26;i++){
char alp='A';
System.out.print((char)(alp + i)+ " ");
} 

System.out.println();

// 2. A(a),B(b),C(c),D(d),...,Z(z) 출력하기
for(int i = 0;i< 26; i++){
char alp = 'A';
if(i == 25) {
System.out.printf("%c(%c) \n",alp+i,alp + 32 + i); //소문자 'a' + i로 해도 가능
}else{
System.out.printf("%c(%c), ",alp + i, alp + 32 + i);
}

}
//다른 방법1
int cnt = 'Z' - 'A' + 1;
for(int i = 0;i<cnt;i++){
if(i != 0)System.out.print(",");
System.out.print((char)('A' + i) + "("+(char)('a'+i)+")");
}
System.out.println();

//다른 방법2
int su = 'A';
while(su <= 'Z') {
	System.out.print((char)su++); 
}


System.out.println();
// 3. 123 \n 456\n 789\n 출력하기

int st = 0;

for(int i = 0;i < 3; i++){
for(int j = 1;j < 4; j++){
	System.out.print(st += 1);
	//System.out.print(3*j + i);
}
System.out.println();
}


//다른 방법 - 이중for문 X
int cnt2 = 0;
for(int i = 0;i<9;i++){
	System.out.print(i+1);
	cnt2++;
	if(cnt2%3==0){
		System.out.println();
}
}


System.out.println();
//4. 123\n 234\n 456\n 출력하기


for(int i = 0;i<3;i++){
int st2 = i;
for(int j = 1;j<4;j++){
System.out.print(st2 += 1);
}
System.out.println();
}

//다른 방법
for(int i = 0;i < 3; i++){
for(int j = 1;j < 4; j++){
	System.out.print(j + i);
}
System.out.println();
}

System.out.println();
//5. ABC\n DEF\n GHI 출력하기

char alp2 = 'A';
for(int i = 0;i< 3; i++){
for(int j = 0;j < 3; j++){
System.out.print(alp2++);
}
System.out.println();
}

System.out.println();System.out.println();

//다른 방법
for(int i = 0;i < 3; i++){
for(int j = 1;j < 4; j++){
	System.out.print((char)(3*i+ j + 64));
}
System.out.println();
}
}
}