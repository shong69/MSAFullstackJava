package com.my.sts.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeptDao { //sqlSessionFactory 설정, mapper 스캔 설정 필요
	@Select("select * from dept order by deptno desc")
	List<DeptVo> selectAll();
	@Insert("insert into dept values(#{deptno},#{dname},#{loc})")
	void insertOen(DeptVo bean);
}