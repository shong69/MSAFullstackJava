package com.sts.bservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sts.bservice.model.DeptVo;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    
    @GetMapping("/api/list")
    public List<?> list() throws Exception{
        try {
            Thread.sleep(5000);
            throw new RuntimeException(" 내가 만든 에러..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return List.of(
            DeptVo.builder().deptno(1111).dname("test1").loc("test").build(),
            DeptVo.builder().deptno(2222).dname("test2").loc("test").build(),
            DeptVo.builder().deptno(3333).dname("test3").loc("test").build()
            );
    }
    
}
