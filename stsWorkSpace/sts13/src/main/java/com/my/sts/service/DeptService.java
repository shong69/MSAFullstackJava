package com.my.sts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.my.sts.model.DeptDao;
import com.my.sts.model.DeptVo;

@Service
public class DeptService {
	@Autowired
	DeptDao dao;
	public void getList(Model model) {
		List<DeptVo> list =dao.selectAll();
		model.addAttribute("list", list);
	}
	public void addList(DeptVo bean) {
		dao.insertOne(bean);
		
	}
}
