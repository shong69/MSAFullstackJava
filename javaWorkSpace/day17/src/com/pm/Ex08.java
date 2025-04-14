package com.pm;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
class WindowClose implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {		
	}

	@Override
	public void windowClosing(WindowEvent e) {		
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {		
	}

	@Override
	public void windowActivated(WindowEvent e) {		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
}
public class Ex08 {
	static Ex08 me;
	String title="제목없음";
	String dir; //파일 제목을 아는 경우 정해주기 위해 필드 선언

	public Ex08() {
		Frame f = new Frame();
		 
		f.addWindowListener(new WindowAdapter() { //WindowAdapter : 두개 이상의 메소드를 선언하는 리스너를 
													//상속해서 아무 구현 안해도 되도록 만들어줌
			public void windowClosing(WindowEvent e) {	
				f.dispose();
			}
		});
		f.setTitle(title); //제목없음으로 일단 시작
		
		MenuBar bar = new MenuBar();
		Menu mn1  = new Menu("파일");
		Menu mn2  = new Menu("보기");
		MenuItem mi1 = new MenuItem("새 파일"); 
		MenuItem mi2 = new MenuItem("열기"); 
		MenuItem mi3 = new MenuItem("저장"); 
		MenuItem mi4 = new MenuItem("다른 이름으로 저장"); 
		MenuItem mi5 = new MenuItem("종료"); 
		
		MenuItem mi6 = new MenuItem("프로그램 소개");
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.add(mi4);
		mn1.addSeparator();
		mn1.add(mi5);
		mn2.add(mi6);
		bar.add(mn1);
		bar.add(mn2);
		f.setMenuBar(bar);
		
		
		//입력 가능한 전체 창
		Font font = new Font("", 0, 20);
		TextArea ta = new TextArea();
		ta.setFont(font);
		f.add(ta);
		//
		mi1.addActionListener(new ActionListener() { //새 파일 
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				ta.setText("");
				title = "제목없음";
				f.setTitle(title);
				dir = "";
			}
		});
		
		mi2.addActionListener(new ActionListener() { //열기
			@Override
			public void actionPerformed(ActionEvent e) {
				InputStream is = null;
				FileDialog dia = new FileDialog(f,"열기",0);
				dia.setVisible(true);
				if(dia.getDirectory()!=null) { //열기하려다가 취소한 경우 null로 반환된다.
					dir = dia.getDirectory();
					title = dia.getFile();						
				}
				File file = new File(dir+title);
				if(file.exists()) {
					f.setTitle(title); //읽어온 파일이름으로 제목 주기
					byte[] buf = new byte[(int)file.length()];
					try {
						is = new FileInputStream(file);
						for (long i = 0; i < file.length(); i++) {
							is.read(buf);
						}
						ta.setText(new String(buf));
						ta.revalidate();
						is.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		
		mi3.addActionListener(new ActionListener() { //저장
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog dia = new FileDialog(f,"저장",FileDialog.SAVE);
				if(f.getTitle().equals("제목없음")) { //값이 없는 경우					
					dia.setVisible(true);
					if(dia.getDirectory()!=null) { //저장하려다가 취소한 경우 null로 반환된다.
						dir = dia.getDirectory();
						title = dia.getFile();						
					}
					f.setTitle(title);
				}//else -> 제목이 있는 경우 dir과 title이 필드에 저장되어 있음 

				File file = new File(dir+title);
				try {
					OutputStream os = null;
					os = new FileOutputStream(file);
					String msg = ta.getText();
					os.write(msg.getBytes());
					os.close();
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("파일 있음");
				}
			}
		});
		
		mi4.addActionListener(new ActionListener() { //다른 이름으로 저장
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog dia = new FileDialog(f,"다른이름으로 저장",FileDialog.SAVE);
				dia.setVisible(true);
				dir = dia.getDirectory();
				title = dia.getFile();
				
				f.setTitle(title);
				File file = new File(dir+title);
				try {
					if(file.createNewFile()) {
						OutputStream os = null;
						os = new FileOutputStream(file);
						String msg = ta.getText();
						os.write(msg.getBytes());
						os.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("파일 있음");
				}
			}
		});
		
		mi5.addActionListener(new ActionListener() { //종료
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		

		Dimension dim = new Dimension(500,800);
		f.setLocation(100,100);
		f.setSize(dim);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		me = new Ex08();
	}

}
