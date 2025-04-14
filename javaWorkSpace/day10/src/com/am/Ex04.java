package com.am;

public class Ex04 {
	public static void main(String[] args) {
		Integer target1 = new Integer(129);
		Integer target2 = new Integer(129);
		System.out.println(target1.byteValue()); //0~255 -> -128~127까지 표현 가능
		System.out.println(target1.shortValue()); 
		System.out.println(target1.longValue()); 
		System.out.println(target1.floatValue()); 
		System.out.println(target1.doubleValue()); 
		System.out.println(target1.intValue()); 
		
		System.out.println(target1.intValue() == target2.intValue() );
		System.out.println(target1 == target2 ); //객체비교가 됨
		System.out.println(target1.equals(target2)); 
		
		
		System.out.println(target1.toString()+1); //래퍼클래스는 언래핑을 하기 때문에 1291로 출력됨
		
		
		System.out.println(Integer.valueOf(target1) + 1); //130
		System.out.println(Integer.valueOf(target1.toString()) + 1); //130 return Integer
		System.out.println(Integer.parseInt(target1.toString()) + 1); //130 return int
		int su = 16;
		System.out.println("2진수 "+ su + "=" +Integer.toBinaryString(su));
		System.out.println("8진수 0"+ su + "=" +Integer.toOctalString(su));
		System.out.println("16진수 0x"+ su + "=" +Integer.toHexString(su));
		
		
		System.out.println("min:"+Integer.min(3, 5));
		System.out.println("max:"+Integer.max(3, 5));
		System.out.println("sum:"+Integer.sum(3, 5));
		
		System.out.println(Integer.bitCount(50000));//Returns the number of one-bits in the two's complement binaryrepresentation of the specified int value. 
 	
		System.out.println(Integer.reverse(0));
		System.out.println(Integer.reverse(1));
		System.out.println(Integer.reverse(127));
		System.out.println(Integer.reverse(Integer.MAX_VALUE));
	
	
		System.out.println(Integer.compare(3, 3)); //0
		System.out.println(Integer.compare(3, 33)); //-1
		System.out.println(Integer.compare(3, 333)); //-1
		System.out.println(Integer.compare(3, 5)); //-1
		System.out.println(Integer.compare(5, 3)); //1
		
		
		System.out.println(target1.compareTo(target2));
	
	}
}
