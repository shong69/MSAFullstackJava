package com.my.sts.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.sts.dept.model.DeptVo;
import com.my.sts.dept.service.DeptService;

@RequestMapping("/dept/")
@Controller
public class DeptController {
	@Autowired
	DeptService deptService;
	
	
	@GetMapping("")
	public String list(Model model) {
		deptService.getList(model);
		return "dept/list";
	}
	@GetMapping("add")
	public void add() {};
	
	@PostMapping("")
	public String add(@ModelAttribute DeptVo bean) {
		deptService.addList(bean);
		return "redirect:./";
	}
	@GetMapping("{deptno}")
	public String detail(@PathVariable int deptno, Model model) {
		deptService.getList(model, deptno);
		return "dept/dept";
	}
	
	@PutMapping(value="{deptno}")
	public String update(@PathVariable int deptno, String dname, String loc) {
		DeptVo bean = new DeptVo(deptno, dname,loc);
		deptService.editlist(bean);
		return "redirect:./";
	}
	
	//ResponseEntity와 @ResponseBody
	// ResponseEntity : 상태코드, 헤더, 본문을 직접 구성 가능한 리턴 타입. 예외 처리, 성공/실패 응답 등 다양한 패턴 구현 가능
	// @ResponseBody : 본문에 데이터를 실어 보내는 방법. 리턴 타입이 단순객체(String, dto)일 때 유용
	
	@DeleteMapping("${deptno}")
	public ResponseEntity<?> delete(@PathVariable int deptno) { 
		//ajax 응답 위해 resp 사용함. resp를 반환하면 view 반환할 필요도 없어서 void 리턴 가능하다.
		if(deptService.rmList(deptno))
			return new ResponseEntity<String>(HttpStatus.OK);
		
//		return new ResponseEntity(HttpStatus.BAD_REQUEST); 400에러. 옛 방식임
//		return ResponseEntity.ok("test"); 200상태코드
//		return ResponseEntity.status(HttpStatus.NOT_FOUND); 404 에러
//		return ResponseEntity.badRequest().build(); //400 에러
		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
	
}
