class Ex06{
public static void main(String[] args){
int a;
a = 1;
double b;
b =3.14;
char ch = '@';
boolean boo = true;

System.out.println("default ����Ÿ�� : " + a);
System.out.println("default ����Ÿ�� : " + b);
System.out.println("default ����Ÿ�� : " + ch);
System.out.println("default ����Ÿ�� : " + boo);

System.out.println("10���� ���� ");
byte e = 1; //-128~127 ���� ������ �ڷ���
short f = 1;
long g = 1L; //long(8byte)�̱� ������ int(4byte)ǥ���� �ǰ� ���� �� L�� �������ֱ� (byte��short�� �ڷ��� ���� ���ص� �ǵ��� ����)


System.out.println("10���� �Ǽ�");
float h = 3.14f; //�ڿ� �ִ� ����� �ڷ����� double(8byte)�ε� float(4byte)�� ���� �־ f�� �ڷ��� ������ �ʿ���
double i = 23.435436;

//----------
byte val = 127;
//val = val + 1; // ���� �߻� byte�� -128~127���� ����

//�ٸ� ���� ���� �� ���� �� ���� �߻�
short val3 = 129;
byte val4;
//val4 = val3; //���� �߻� -> ���� Ÿ�� ��ȯ ���Ѿ� ��
val4 = (byte)val3; //short�� val3�� byte�� �� ��ȯ -> ǥ�������� ���ļ� �߸� ���ɼ��� �����ϰ� �ٲ�� �Ѵ�.


//---------���� ����ȯ byte�� short

float val5 = 0.1F;
System.out.println("128->"+val4); //val4 �� byte�� 129 -> ����� 127 ǥ�� ������ �Ѿ��� ������ -127�� ���´�

//---------���� ����ȯ int�� long
System.out.println((int)2147483647L);//2147483647 //long Ÿ���� int�� ���� ����ȯ
System.out.println((int)2147483648L);//-2147483648 ��� //int�� ǥ������ ���ļ� ���� ǥ����
System.out.println((long)2147483648L); //int�� ǥ�������� �Ѿ�� ������ longŸ������ �����ϸ� ����� �� �� ����



//-------���� ����ȯ

System.out.println((char)65); //A ���
System.out.println((int)'a'); //65 ���

short su1 = 65;
char ch2 = 'a';
//ch2 = su1; ������. short�� char�� ǥ�� ������ �ٸ���.(int>short>char)
int su2 = 65;
su2 = ch2; //97 ��µȴ�. �ڵ�����ȯ��

ch2 = 66; // short�� ���� 66�� �������� ���� ������ ������ ���� ���� char�� ������ ��� ����� �ȴ�. 
	// ���� �Ϻ��ϰ� int Ȥ�� short�� ���ϸ� �ȵǴ� ����. 

System.out.println("********����*********");

**
*�Ǽ� + ���� ������ �ص� ���� ĳ�������� �Ǽ��� ���Ǿ� ��µȴ�.
*�Ǽ��� ����Ǵ� ���� �˰Ը𸣰� ���� �Ͼ. like 5/2�� 5/2.0���� �Ǵ� ��ó��
**

System.out.println(1+1.0); //2.0 ���






}
}