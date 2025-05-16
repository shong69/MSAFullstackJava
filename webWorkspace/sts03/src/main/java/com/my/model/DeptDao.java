package com.my.model;

import java.util.List;

public interface DeptDao {
	public List<DeptDto> selectAll();

	public void insertOne(DeptDto deptDto);

	public DeptDto selectOne(int deptno);

	public int updateOne(DeptDto command);

	public void deleteOne(int deptno);
}
