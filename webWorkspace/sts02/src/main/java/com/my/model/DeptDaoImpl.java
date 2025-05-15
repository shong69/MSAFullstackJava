package com.my.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DeptDaoImpl extends JdbcDaoSupport implements DeptDao{
	Logger log = Logger.getLogger(this.getClass());
	
	RowMapper<DeptDto> rowMapper = new RowMapper<DeptDto>() {
		
		@Override
		public DeptDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			DeptDto bean = new DeptDto(
						rs.getInt("deptno"),
						rs.getString("dname"),
						rs.getString("loc")
					);
			log.debug(bean);
			return bean;
		}
	};
	
//	public DeptDaoImpl() {
//		MysqlDataSource dataSource = new MysqlDataSource();
//		dataSource.setUrl("jdbc:mysql://localhost:33306/xe");
//		dataSource.setUser("scott");
//		dataSource.setPassword("tiger");
//		setDataSource(dataSource);
//	}
	@Override
	public List<DeptDto> selectAll(){
		String sql = "select deptno, dname, loc from dept";
		return getJdbcTemplate().query(sql, rowMapper);
	}
	@Override
	public DeptDto selectOne(int deptno) {
		String sql = "select * from dept where deptno=?";
		return getJdbcTemplate().queryForObject(sql, rowMapper, deptno);
	}
	@Override
	public void insertOne(DeptDto bean) {
		String sql = "insert into dept values(?,?,?)";
		getJdbcTemplate().update(sql, bean.getDeptno(), bean.getDname(), bean.getLog());
	}
	@Override
	public int update(DeptDto bean) {
		String sql = "update dept set dname=?, loc=? where deptno=?";
		return getJdbcTemplate().update(sql, bean.getDname(), bean.getLog());
	}
	@Override
	public int deleteOne(int deptno) {
		String sql = "delete from dept where deptno=?";
		return getJdbcTemplate().update(sql, deptno);
	}
	
}
