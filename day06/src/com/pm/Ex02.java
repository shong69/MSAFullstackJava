package com.pm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {


		// �ֹι�ȣ üũ��(ver 0.1.0)
		// �ֹι�ȣ�� �Է� > 990629-32165163
		// ����� 27�� �����Դϴ�.
		
		//�ֹι�ȣ�� �Է� > 00121654-6541325
		//����� 26�� �����Դϴ�.

		//�ֹι�ȣ�� �Է� > 00121654-6541325
		//�Է� ������ �ٽ� Ȯ���ϼ���(000000-0000000)
		
		//�ֹι�ȣ�� �Է� > abc121654-6541325
		//���ڸ� �Է��ϼ���
		
		//���� : �ѱ�����
		
		//-> ���� �����ڸ� + "-" + ���� �ϰ��ڸ� �θ� �Է¹޵���
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("�ֹι�ȣ üũ��(ver 0.1.0)");
			System.out.print("�ֹι�ȣ�� �Է� >");
			
			String input = sc.nextLine(); 
			
			if(input.equals("0")) {
				System.out.println("���α׷��� �����մϴ�.");
				isTrue = false;
				return;
			}
			
			// �߰�) �ѱ� ���� ��� :
			/* ��Ģ�� ���� ���ڿ� ��Ģ�� �ο��ؼ� ó���ϸ� �ȴ�.
			 * �ε����� ���� ������ �ѱ� ���ڸ� �迭�� �ְ�
			 * �Է��� ���� �迭��  for������ ������ idx�� ��ġ�Ѵٸ� �ѱۼ��ڹ迭[idx]�� ���� �ٲ��ش�
			 * */
			char[] arr1 = input.toCharArray();
			char[] role= {'��','��','��','��','��','��','��','ĥ','��','��'};
			char[] target = new char[10];
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < role.length; j++) {
					if(arr1[i] == role[j]) {arr1[i] = target[j];}
				}
			}
			
			//arr1 ���� �迭�� �ٽ� ���ڿ��� �ٲ��ֱ� (�̸� ���� �޼��� �Ű������� String�Ӥ�)
			input = new String(arr1); 
			
			checkSsn(input);
		}

	}
	
	/** ��ȿ�� ����� ���� �޽��� ���
	 * @param input
	 */
	public static void checkSsn(String input) {
		int val = checkVal(input);
		
		if(val == -1) { //���� ���� ���͵� �Է��� ���
			System.out.println("���ڸ� �Է��ϼ���.");
		}else if(val== -2) { // ������ ���� �ʴ� ���
			System.out.println("�Է� ������ �ٽ� Ȯ���ϼ���(000000-0000000)");
		}else {
			calSexAndAge(input);
		}
		
	}
	
	/** ��ȿ�� Ȯ��
	 * @param input
	 * @return
	 */
	public static int checkVal(String input) {
		//�� ������ 14������ Ȯ��
		if(input.length()!=14) {
			return -2;
		}
		
		//�ֹι�ȣ 8��°�� 1,2,3,4�� �ƴ� ������ ���
		int num = input.toCharArray()[7]-'0';

		if(num != 1 && num!=2 && num!= 3 && num!= 4) {
			return -2;
		}
		
		//���� �� ���� Ȯ��
		if(((input.toCharArray()[2]-'0')*10 + (input.toCharArray()[3]-'0'))>12) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
			return -2; //12���� ���� ���� �Է����� ��
		}else {
			if(((input.toCharArray()[4]-'0')*10 + (input.toCharArray()[5]-'0'))>31){
				System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
				return -2; //31���� ���� ���� �Է����� ��
			}
		}
		
		
		//6��°�� -(���) �ִ��� Ȯ��
		//0~5��°, 7~13��°�� �������� Ȯ��
		int numVal = 0;
		for (int i = 0; i < input.length(); i++) {
			//6��° ��ȣ�� ��ð� �ƴ� ��
			if(i==6 && input.charAt(i)!='-') { return -2;} 
			
			//������ ������ ���ڰ� �ƴ� ��
			if(i != 6 && (input.charAt(i)-'0'<=0 || input.charAt(i)-'0'>=9)) { 
				numVal = -1;
			}

		}
		return numVal;

	}
	
	/** ���̿� ���� ����ϰ� ����ϱ�
	 * @param input
	 */
	public static void calSexAndAge(String input) {
		String sex = null;
		int year = LocalDate.now().getYear(); //���� ����
		int bornYear = 0;
		int age;
		
		//0~1��°�� ���� && 7��°�� 2,4�� �� ���� && 1,3�� �� ����
		char[] sexArr = input.toCharArray(); 

		//���� ����ϱ�
		if(sexArr[7]=='3' || sexArr[7]=='4') {//2000������ ���
			bornYear = 2000 + (sexArr[0]-'0')*10 + (sexArr[1]-'0');
			
		}else if(sexArr[7]=='1' || sexArr[7]=='2'){ //�� ������ ���
			bornYear = 1900 + (sexArr[0]-'0')*10 + (sexArr[1]-'0'); 
		}
		
		age = year - bornYear + 1; //�ѱ����̷�
		
		//���� ��������
		if(sexArr[7]=='1' || sexArr[7]=='3') { 
			sex = "����";
		}else if(sexArr[7]=='2' || sexArr[7]=='4') {
			sex = "����";
		}
		
		System.out.printf("����� %d�� %s�Դϴ�.\n", age, sex);
		
	}
	

}
