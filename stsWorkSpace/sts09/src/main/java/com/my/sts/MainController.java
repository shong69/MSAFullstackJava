package com.my.sts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	String path = "D:\\MSAFullstackJava\\stsWorkSpace\\uploadFile";
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String uploadForm() {
		return "index";
	}
	
	//io 활용해서 넣는 방법
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String uplaodResult(MultipartFile file1,String msg, HttpServletRequest req) {
//		String name = file1.getOriginalFilename();
//		try (
//				//저장하고싶은 위치+파일 원본명 으로 파일 생성
//				FileOutputStream os = new FileOutputStream(new File("D:\\MSAFullstackJava\\stsWorkSpace\\uploadFile"+name));
//				InputStream is = file1.getInputStream();				
//				){
//			//해당 파일에 이미지 넣기
//			while(true) {
//				int su = is.read();
//				if(su==-1) break;
//				os.write(su);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "result";
//	}
	//io없이 넣는 방법
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String uplaodResult(Model model, MultipartFile[] files,String msg, HttpServletRequest req) {
		List<Map<String,String>> arr = new ArrayList<>();
		for(MultipartFile file1:files) {
			String origin=file1.getOriginalFilename();
			String name = System.currentTimeMillis()+"_"+origin;
			File f=new File("D:\\MSAFullstackJava\\stsWorkSpace\\uploadFile"+name);
			try {
				file1.transferTo(f);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Map<String, String> map = new HashMap<>();
			map.put("origin", origin);
			map.put("name", name);
			arr.add(map);
		}
		model.addAttribute("arr", arr);
		return "result";
	}
	
	//무조건 이미지를 다운 받도록 만들거임
	@GetMapping("/download")
	public void down(String origin, String newName, HttpServletResponse resp) {
		resp.setContentType("application/actet-stream"); //브라우저가 이해 못하고 다운받게 만들도록함
		//응답 헤더에 이름을 넘겨준다.
		resp.setHeader("Content-Disposition", "attachment; filename=\""+origin+"\"");
		//이름 설정해줘야 함(download가 이름 기본 설정임)
		File f= new File(path+newName);
		try(
				InputStream is=new FileInputStream(f);
				OutputStream os=resp.getOutputStream();
				){
			while(true) {
				int su=is.read();
				if(su==-1)break;
				os.write(su);
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@GetMapping("{origin}")
//	@GetMapping("{origin:.+}") //확장자를 포함해서 가져온다는 의미 :.+
	public void down2(@PathVariable String origin, String newName, HttpServletResponse resp) {
		resp.setContentType("application/actet-stream");
		File f= new File(path+newName);
		try(
				InputStream is=new FileInputStream(f);
				OutputStream os=resp.getOutputStream();
				){
			while(true) {
				int su=is.read();
				if(su==-1)break;
				os.write(su);
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
