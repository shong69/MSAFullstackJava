package com.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Ball implements Serializable{
	private static final long serialVersionUID = 1L; //자바 시리얼 넘버 부여 기능
//	final int version = 111; //4. 버전을 필드에 명시하여 이후에 해당 버전만 실행하도록 하면 된다. -> 자바가 새로 생긴 필드 오류 내는것도 이런 방식임
	int num;
//	String color; //2.필드 추가 -> 수정 후 오류 일으킴
	transient String color; //3. transient : 직렬화 대상에서 제외한다는 의미
	public Ball(int num) {
		this.num = num;
		if(num>25) color = "red"; //2-1. 생성자에 추가한 필드 조건 기입
		else color = "blue";
	}
	public void play() {
//		System.out.println(num+"번 굴러감");
		System.out.println(num +"던짐"); //1. 객체의 메서드는 파일에 포함되지 않음 -> 메서드 수정에 오류는 안남
		System.out.println(color + "색 공 "+num+"번 던짐"); //2-2. ObjectStream 추가 이후 수정된 필드를 메서드에 추가함
											//-> 필드를 수정하면 오류가 나게 된다. -> 필드는 파일에 직렬화되어 포함된다는 의미
	}
	@Override
	public String toString() {
		return num+"번 공";
	}
}
public class Ex11 {
	public static void main(String[] args) {
		File file = new File("data11.bin");
		
		OutputStream os = null;
		java.io.ObjectOutputStream oos =  null;
		try {
			file.createNewFile();
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			//Ball객체를 활용해 로또 번호 추첨 해보기
			Ball ball = new Ball(45);
			oos.writeObject(ball); //직렬화 되지 않아서 에러 남 :NotSerializableException (Serializable 인터페이스 상속받기)
			
			
//			oos.writeObject("문자열");
//			
//			int[] arr1 = {1,3,5,7};
//			oos.writeObject(arr1);
//			
//			Vector vec = new Vector();
//			vec.add("vec1");
//			vec.add("vec2");
//			vec.add("vec3");
//			oos.writeObject(vec);
//			
//			ArrayList list = new ArrayList();
//			list.add(1111);
//			list.add(2222);
//			list.add(4444);
//			oos.writeObject(list);
//			
//			HashSet set = new HashSet();
//			set.add(1111);
//			set.add(2222);
//			set.add(3333);
//			oos.writeObject(set);
//
//			HashMap map = new HashMap();
//			map.put("key1","val1");
//			map.put("key2","val1");
//			map.put("key3","val1");
//			oos.writeObject(map);
//			
			
			
			oos.close();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
