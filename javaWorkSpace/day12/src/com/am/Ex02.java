package com.am;


public class Ex02 {
	private static class MyErr extends Exception{

		public MyErr(String string) {
			super(string); //Exception의 스트링 매개변수 생성자 상속
		}};
	public static void main(String[] args) {
		//학생 성적 관리 프로그램(ver 0.10.0)
		System.out.println("학생 성적 관리 프로그램(ver 0.10.0)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int input = -1;
		
		System.out.print("총원> ");
		int tot = Integer.parseInt(sc.nextLine());
		int[][] data = new int[tot][];
		int cnt = 0;
		while(true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			try {
				input = Integer.parseInt(sc.nextLine()); //문자를 숫자로 치환
			}catch (NumberFormatException e) { //치환했는데 숫자가 아닌 경우 나타나는 에러
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if(input == 0)break;
			
			if(input == 1) {
				System.out.println("------------------------------------------------");
				System.out.println("학번	|국어	|영어	|수학	|합계	|평균");
				System.out.println("------------------------------------------------");
				for(int i = 0;i<data.length;i++) {
					int[] stu = data[i];
					if(stu!= null)System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]);
					
				}
				System.out.println("------------------------------------------------");
				
			}
			if(input == 2) {
				int[][] temp = data;
				data = new int[data.length+1][];
				for (int i = 0; i < temp.length; i++) {
					data[i] = temp[i];
				}
				
				int[] stu = new int[4];
				String[] arr = {"국어","영어","수학"};
				stu[0] = cnt+202501;
				for (int i = 0; i < stu.length; i++) {
					System.out.print(arr[i-1]+"> ");
					try {
						stu[i]=Integer.parseInt(sc.nextLine());
						if(stu[i]<0 || stu[i]>100) {
							throw new MyErr("점수 범위가 아닙니다.");
						}
					}catch(NumberFormatException e) {
						System.out.println("입력이 잘못됐습니다.");
						i--;
						continue; 
					} catch (MyErr e) {
						System.out.println(e.getMessage()); //"점수 범위가 아닙니다." 출력
						i--;
						continue;
					}
					
//					System.out.println("입력이 잘못됐습니다.");
//					if(stu[i]>100 || stu[i]<0) {//잘못된 학번 입력 시 재입력
//						i--;
//						continue; 
//					}
				}
				data[cnt++] = stu;
				
//				System.out.print("국어> ");
//				stu[0] = Integer.parseInt(sc.nextLine());
//				System.out.print("영어> ");
//				stu[1] = Integer.parseInt(sc.nextLine());
//				System.out.print("수학> ");
//				stu[2] = Integer.parseInt(sc.nextLine());
			}
			
			if(input == 4) {
				System.out.print("삭제할 학번> ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				int idx = -1;
				for (int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					if(num2 == stu[0])idx = i;
				}
				
//				if(idx!=-1)data[idx] = null;
				if(idx!=-1) {
					int[][] before = data;
					
					data = new int[before.length-1][];
					for (int i = 0; i < idx; i++) {
						data[i]=before[i];
					}
					for (int i = idx; i < before.length; i++) {
						data[i-1]=before[i];
					}
//					System.arraycopy(before, 0, data, 0, idx);//idx만큼 복사를 해줌
//					System.arraycopy(before, idx+1, data, idx, before.length-idx-1); //idx 다음거부터 복사
					
				}else {
					System.out.println("존재하지 않는 학번입니다.");
				}

			}
			
			if(input == 3) {
				System.out.print("수정할 학번> ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				int idx = -1;
				for (int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					if(num2 == stu[0])idx = i;
				}
				
				if(idx != -1) {
					int[] stu = new int[4];
					String[] arr = {"국어","영어","수학"};
					stu[0] = cnt+202501;
					for (int i = 0; i < stu.length; i++) {
						System.out.print(arr[i-1]+"> ");
						try {
							stu[i]=Integer.parseInt(sc.nextLine());
							if(stu[i]<0 || stu[i]>100) {
								throw new MyErr("점수 범위가 아닙니다.");
							}
						}catch(NumberFormatException e) {
							System.out.println("입력이 잘못됐습니다.");
							i--;
							continue; 
						} catch (MyErr e) {
							System.out.println(e.getMessage()); //"점수 범위가 아닙니다." 출력
							i--;
							continue;
						}
					}
				}
			}
		}
	}
}
