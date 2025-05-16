package com.my.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.SimpleTransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

public class DeptDao2Impl{// implements DeptDao{
	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	TransactionDefinition definition; //= new DefaultTransactionDefinition();
	
	private RowMapper<DeptDto> rowMapper = new RowMapper<DeptDto>() {
		
		@Override
		public DeptDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptDto(
					rs.getInt("deptno"),
					rs.getString("dname"),
					rs.getString("loc")
					);
		}
	};
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	public void setDefinition(TransactionDefinition definition) {
		this.definition = definition;
	}
	public List<DeptDto> selectAll(){
		String sql = "select * from dept";
		return jdbcTemplate.query(sql, rowMapper);
	}

	//@Override
	public void insertOne(DeptDto deptDto) {
		String sql = "insert into dept values(?,?,?)";
		TransactionStatus status = transactionManager.getTransaction(definition);
		try{
			jdbcTemplate.update(sql, deptDto.getDeptno(), deptDto.getDname(), deptDto.getLoc());	
			//두 번 쿼리 날려서 rollback 잘 되는지 확인
//			jdbcTemplate.update(sql, deptDto.getDeptno(), deptDto.getDname(), deptDto.getLoc());			
			transactionManager.commit(status);
		}catch(Exception e) {
			transactionManager.rollback(status);
		}
	}
}
