package com.my.sts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.sts.model.DeptRepo;
import com.my.sts.model.DeptVo;
import com.my.sts.model.entity.Dept;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApiController {
	private final DeptRepo deptRepo;
	
	@Cacheable("dept")
	@GetMapping("/")
	public List<?> list(){
		List<DeptVo> list = new ArrayList<>();
		deptRepo.findAll().forEach(ele->list.add(ele.voBuilder()));
		return list;
	}
	
	@CacheEvict(value="dept",allEntries = true)//모든 entry들의 갱신 요청
	@PostMapping("/")
	public DeptVo add(@RequestBody DeptVo bean) {
		return deptRepo.save(Dept.builder()
				.deptno(bean.getDeptno())
				.dname(bean.getDname())
				.loc(bean.getLoc())
				.build()).voBuilder();
		
	}
}
