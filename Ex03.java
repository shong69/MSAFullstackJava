class Ex03 {
public static void main(String[] args) {

	//********������ ���****************
	System.out.println('a');
	System.out.println('\uac00'); //��
	
	char ch1;
	ch1= '\uac01'; //��
	System.out.println(ch1);

	char ch2 = 65;
	System.out.println(ch2);
	System.out.println(ch1 + ch2);
	
	
	System.out.println("����" + "��"); //���ڿ��� ���ڿ��� ���߱� ������ �״�� ���� ���� ���ڿ��� ��µȴ�.
	
	System.out.println("����" + '��'); //�״�� ���ڿ���
	System.out.println("����" + 123); //���ڵ� ���ڿ� ��
	
	
	//********���ڿ��� ���****************
	String msg;
	msg = "���ڿ�";
	System.out.println(msg);
	
	System.out.println(2024 + 1 + "��");
	System.out.println("year"  + 2024 + 1);
	
	System.out.println('5' + 1);
	
	//********���������� ���****************
	System.out.println("ABCSCSK\babcd");
	System.out.println("ABCD\babcd");
	
	System.out.println("\\\\"); // \\��µ�
	System.out.println("http:\\\\naver.com"); // http:\\naver.com
	
	System.out.println("ABCD\"ab\"cd"); //ABCD"ab"cd
	
	System.out.println("ABCD\nabcd");//ABCD
								//abcd
	System.out.println("ABCD\r\nabcd");//ABCD
								//abcd
								
	System.out.println("ABCD\u0009aabcd"); //ABCD    aabcd
	
	//********������ �ٲ� ���****************
	
	int su1 = 0xac00;
	System.out.println("16����  ac00 = "+ su1); //16����  ac00 = 44032
	
	int su2 = 010;
	System.out.println("8���� 010 = "+ su2); //8���� 010 = 8
	
	
}
}