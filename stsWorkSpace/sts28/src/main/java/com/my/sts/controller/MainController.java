package com.my.sts.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.sts.model.entity.Dept;
import com.my.sts.model.entity.DeptRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MainController {

	private final DeptRepo deptRepo;
	
	@GetMapping("/")
	public List<?> list(){
		return deptRepo.findAll();
	}
	
	@PostMapping("/")
	public Dept add(@ModelAttribute Dept dept) {
		return deptRepo.insert(dept);
	}
	
	@GetMapping("/{deptno}")
	public Dept getMethodName(@PathVariable int deptno) {
		return deptRepo.findById(deptno).get(); //String으로 넘겨야 함. ObjectId 안에 있던 문자열이 id로 넘어가고 있기 때문에 String으로 받으라고 강요중
	}
	
	@PutMapping("path/{deptno}")
	public Dept update(@PathVariable int deptno,@RequestBody Dept dept) {
		return deptRepo.save(dept);
	}
	
	@DeleteMapping("path/{deptno}")
	public void delete(@PathVariable int deptno) {
		deptRepo.deleteById(deptno);
	}
}
