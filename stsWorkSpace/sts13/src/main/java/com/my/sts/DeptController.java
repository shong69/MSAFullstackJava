package com.my.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.my.sts.model.DeptVo;
import com.my.sts.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	DeptService service;
	@GetMapping("/dept/")
	public String index(Model model)  {
		service.getList(model);
		return"list";
	}
	
	@PostMapping("/dept/")
	public String add(@ModelAttribute DeptVo bean) {
		service.addList(bean);
		return "redirect:./";
	}
}
