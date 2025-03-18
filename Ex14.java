/*
1. 1~20까지 중 홀수를 출력하시오
2. 1~50 중 5의 배수만을 출력하시오
3. 1~50의 합계를 구하시오
4. 다음을 출력하시오 
2+4+6+8+10=???
5. 구구단을 출력하시오(포멧은 그림대로) 
*/

class Ex14{
public static void main(String[] args){

	//*****1~20까지 중 홀수만 출력하기*****

	for(int val=0; val<=20; val++){
		if(val%2==1){
			System.out.print(val+" ");
		}
		
	}
	System.out.println();


	//*****1~50 중 5의 배수만 출력하기*****
	for(int i = 1; i<=50;i++){
		if(i%5 == 0){
			System.out.print(i+" ");
		}
		
	}
	System.out.println();


	//*****1~50의 합계를 구하시오*****
	int sum = 0;
	
	for(int i = 1; i<=50;i++){
		sum += i;
	}
	System.out.println(sum);

	

	//*****2+4+6+8+10=??? 을 출력하기*****
	int sum2 = 0;
	for(int i = 1;i<=10;i++){
		if(i%2==0){
			if(i == 10) {
				System.out.print(i + "=");
				sum2 += i;
			}else{
				System.out.print(i + "+");
				sum2 += i;
			}
			
		}
		
	}
	System.out.println(sum2);

	
	//*****구구단을 출력하시오(포멧은 그림대로)*****  
	
	for(int i = 1; i<=10;i++){
		for(int val = 2; val<10;val++){
			System.out.printf("%d X %d = %d\t", val, i, val*i );
			
		}
		System.out.println();
		
	}
}
}