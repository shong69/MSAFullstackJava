package com.my.sts05.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

//@Component //컴포넌트 스캔 
//@Repository
//component > controller, service, repository,...의 구조임
//service, repository - 객체 생성 시점에 따른 구분임 -  Repository->Service->Controller 순으로 객체가 생성된다. - autowired가 성공함
public class DeptDao1Impl implements DeptDao{
	@Autowired
	JdbcTemplate jdbcTemplate; //dao보다 먼저 만들어져야 생성자 주입이 될 수 있다. ->root-context에서 빼야함
	//listener은 context에 달리는것 -> 리스너가 먼저 시작됨
	//context-root에서 servlet.xml을 읽어들이기 때문에 servlet.xml에 dao를 등록하면 됨

	//dao에 컴포넌트 어노테이션을 달면서 객체 생성을 하도록 함 -> jdbcTemplate 이후 읽힌다.
	
	RowMapper<DeptVo> rowMapper = new RowMapper<DeptVo>() {
		
		@Override
		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVo(rs.getInt("deptno"), rs.getString("dname"),rs.getString("loc"));
		}
	};
	@Override
	public List<DeptVo> selectAll() {
		String sql = "select * from dept";
		return jdbcTemplate.query(sql,rowMapper);
	}

	@Override
	public DeptVo selectOne(int pk) {
		String sql = "";
		return null;
	}

	@Override
	public void insertOne(DeptVo bean) {
		String sql = "insert into dept values(?,?,?)";
		jdbcTemplate.update(sql,bean.getDeptno(),bean.getDname(),bean.getLoc());
		
	}

	@Override
	public int updateOne(DeptVo bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int pk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
