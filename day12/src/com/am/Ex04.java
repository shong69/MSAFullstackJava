package com.am;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("�л������������α׷�(ver 0.11.0)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		MyArray data = new MyArray();
//		java.util.ArrayList data = new java.util.ArrayList(); -> array ��� ����
		int input = 0;
		while(true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����> ");
			input = sc.nextInt();
			if(input == 0)break;
			
			if(input ==1) {
				System.out.println("------------------------------------------------");
				System.out.println("�й�	|����	|����	|����	");
				System.out.println("------------------------------------------------");
				for (int i = 0; i < data.size(); i++) {
					int[] stu = (int[])data.get(i);
					System.out.println(stu[0] + "\t|"+stu[1]+"\t|"+stu[2]+"\t|"+ stu[3]);
				}
			}
			if(input ==2) {
				int[] stu = new int[4];
				
				System.out.print("�й�> ");
				stu[0]= sc.nextInt();
				System.out.print("����> ");
				stu[1]= sc.nextInt();
				System.out.print("����> ");
				stu[2]= sc.nextInt();
				System.out.print("����> ");
				stu[3]= sc.nextInt();
				data.add(stu);
				
				
			}
			
			
			
//			if(input ==1) {
//				for (int i = 0; i < data.size(); i++) {
//					System.out.println(data.get(i++)+"\t|"+data.get(i++) + "\t|"+data.get(i++)
//						+"\t|"+data.get(i++)+"\t|"+ data.get(i));
//				}
//			}
//			if(input ==2) {
//				
//				System.out.print("�й�> ");
//				input= sc.nextInt();
//				data.add(input);
//				System.out.print("����> ");
//				input= sc.nextInt();
//				data.add(input);
//				System.out.print("����> ");
//				input= sc.nextInt();
//				data.add(input);
//				System.out.print("����> ");
//				input= sc.nextInt();
//				data.add(input);
//			}
			
			
			if(input == 3) {
				System.out.print("�й�> ");
				input = sc.nextInt();
				int idx = -1;
				for (idx = 0; idx < data.size(); idx++) {
					int[] stu = (int[])(data.get(idx));
					if(stu[0] == input) break;
				}

				if(data.size()!= idx) {
					int[] stu = new int[4];

					stu[0]= input;
					System.out.print("����> ");
					stu[1]= sc.nextInt();
					System.out.print("����> ");
					stu[2]= sc.nextInt();
					System.out.print("����> ");
					stu[3]= sc.nextInt();
					data.set(idx,stu);
				}
				
			}
			if(input == 4) {
				System.out.print("�й�> ");
				input = sc.nextInt();
				int idx = -1;
				for (idx = 0; idx < data.size(); idx++) {
					int[] stu = (int[])(data.get(idx));
					if(stu[0] == input) break;
				}
				
				if(data.size() != idx)data.remove(idx);
				
			}

		}
	}
}
