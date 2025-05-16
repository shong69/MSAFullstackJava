package com.my.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

public class DeptDao3Impl {//implements DeptDao{
	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	TransactionDefinition definition;
	
	public void setDefinition(TransactionDefinition definition) {
		this.definition = definition;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
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
	
	public List<DeptDto> selectAll(){
		String sql = "select * from dept order by deptno desc";
//		return jdbcTemplate.query(sql, rowMapper);
		
		//query()메서드에서 prepareStatementCreator를 매개변수1로 받는 경우
		PreparedStatementCreator psc =null;
		psc = new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				//Connection을 매개변수로 받아와서 만든다.
				//-> Connection을 통해 객체의 주소 값을 알 수 있음 -> hashcode 정보를 알 수 있다
				//-> 두 번 호출했을 때 Connection들의 hashcode 값을 비교해서 같은 커넥션이었는지 알 수 있음
				//-> == rollback을 하면 해당 커넥션에 대한 롤백이기 때문에 이전 Connection 객체는 rollback되지 않음
				// 같은 트랜젝션이 되기 위해서는 같은 커넥션이어야 하는데 
				//이를 위해서는 트랜젝션 매니저가 필요하다.
				
				//DeptDao2에서도 같은 Connection을 가지고 트랜젝션을 수행하고 있음(내부가 안보이는 방식으로)
				//DeptDao3Impl에서는 transactionManager을 통해 같은 커넥션을 사용하도록 해 관리하고 있음
				return con.prepareStatement(sql);
			}
		};
		TransactionStatus status=transactionManager.getTransaction(definition);
		//같은 definition으로 묶여졌기 때문에 같은 Connection이 되는 것 => definition이 key역할을 한다.
		
		try {
			jdbcTemplate.query(psc, rowMapper);
			List<DeptDto> result = jdbcTemplate.query(psc,rowMapper); 
			transactionManager.commit(status);
			return result;
		}catch(Exception e) {
			transactionManager.rollback(status);
		}
		return null;		
	}

	//@Override
	public void insertOne(DeptDto deptDto) {
		String sql = "insert into dept values(?,?,?)";
		jdbcTemplate.update(sql, deptDto.getDeptno(), deptDto.getDname(), deptDto.getLoc());
	}
}
