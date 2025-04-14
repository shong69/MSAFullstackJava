package com.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Ex07 {
	public static void main(String[] args) {
		File f = new File("data01.bin");
		
		byte[] buf = new byte[8];
		InputStream  is =  null;
		try {
			is = new FileInputStream(f);
//			int su = is.read(buf);
//			System.out.println("su="+su);
//			System.out.println("array="+java.util.Arrays.toString(buf));
//			System.out.println(new String(buf,0,su));
			
			int su = -1;
			ArrayList<Byte> list = new ArrayList<Byte>();
			while((su=is.read(buf))!=-1) {
//				System.out.println(new String(buf,0,su));
				for (int i = 0; i < su; i++) {
					list.add(buf[i]); //리스트에 버퍼의 값을 넣는다
				}
			}
			Byte[] arr2 = list.toArray(new Byte[] {});
			byte[] arr3 = new byte[arr2.length];
			for (int i = 0; i < arr2.length; i++) {
				arr3[i] = arr2[i];
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//
//public class Ex03 {
//
//	public static void main(String[] args) {
//		File target=new File("video01.mp4");
//		File copy=new File("copy01.mp4");
//		try {
//			if(!copy.exists())copy.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		InputStream is=null;
//		OutputStream os=null;
//		byte[] buf=new byte[8];
////		1:15150ms
////		2:7629ms
////		4:3877ms
////		8:1962ms
//		
//		try {
//			is=new FileInputStream(target);
//			os=new FileOutputStream(copy);
//			
////			for(long i=0; i<target.length(); i++) {
//			long before=System.currentTimeMillis();
//			while(true){
////				int su=is.read();
////				System.out.print(su+" ");
////				if(su==-1)break;
////				os.write(su);
//				int su=is.read(buf);
//				if(su==-1)break;
//				os.write(buf,0,su);
//			}
//			long after=System.currentTimeMillis();
//			System.out.println("    狗 :"+(after-before)+"ms");
//			os.close();
//			is.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//}
//











