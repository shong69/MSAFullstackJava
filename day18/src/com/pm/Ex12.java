package com.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Ex12 {
	public static void main(String[] args) {
		File file = new File("data11.bin");
		
		InputStream is = null;
		ObjectInputStream ois = null;
		
		try {
			file.createNewFile();
			is = new FileInputStream(file);
			ois =new ObjectInputStream(is);
			Ball obj = (Ball)ois.readObject(); //Object로 반환되기 때문에 캐스팅 해야 함
			System.out.println(obj);
			obj.play(); //객체를 넣을 당시의 메서드가 아닌 현재 수정된 메서드가 출력된다.
						//->객체의 메서드는 파일에 들어가지 않는다.
						//수정된 객체의 필드는 오류를 일으키게 된다 
						//-> 객체의 필드는 직렬화 되어 파일에 속하게 된다는 의미
				
//			System.out.println(ois.readObject());
//			System.out.println(Arrays.toString((int[])ois.readObject()));
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
			
			
			
			
			ois.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
