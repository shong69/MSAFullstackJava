package com.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mysql.cj.jdbc.MysqlDataSource;
					//Convenient super class for JDBC-based data access objects. 
public class DeptDao extends JdbcDaoSupport{
	RowMapper<DeptDto> rowMapper = new RowMapper<DeptDto>() {
		@Override
		public DeptDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptDto(
					rs.getInt("deptno")
					,rs.getString("dname")
					,rs.getString("loc")
					);
		}
	};
	public DeptDao() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://ad19efbe0812:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		setDataSource(dataSource);
	}
	public List<DeptDto> selectAll() throws SQLException{
		String sql="select * from dept order by deptno desc";
		return getJdbcTemplate().query(sql, rowMapper);

	}
	
	public void insertONe(DeptDto bean) throws SQLException {
		String sql = "insert into dept values(?,?,?)";
		getJdbcTemplate().update(sql, new Object[] {
				bean.getDeptno(), bean.getDname(), bean.getLoc()
		});
	}
	
	public DeptDto selectOne(int pk) throws SQLException {
		String sql = "select deptno, dname, loc from dept where deptno=?";
		return getJdbcTemplate().queryForObject(sql,rowMapper,pk);
	}
	public int updateOne(DeptDto bean) {
		String sql = "update dept set dname=?, loc=? where deptno=?";
		return getJdbcTemplate().update(sql,bean.getDname(), bean.getLoc(), bean.getDeptno());
		
	}
	public int deleteOne(int deptno) {
		String sql = "delete from dept where deptno=?";
		return getJdbcTemplate().update(sql,deptno);
	}
}
